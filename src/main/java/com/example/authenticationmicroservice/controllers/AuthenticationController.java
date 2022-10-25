package com.example.authenticationmicroservice.controllers;

import com.example.authenticationmicroservice.entities.User;
import com.example.authenticationmicroservice.excepotions.*;
import com.example.authenticationmicroservice.requests.LoginRequest;
import com.example.authenticationmicroservice.requests.LogoutRequest;
import com.example.authenticationmicroservice.requests.RefreshRequest;
import com.example.authenticationmicroservice.requests.RegisterRequest;
import com.example.authenticationmicroservice.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/auth")
@RequiredArgsConstructor
@Validated
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<Object> register(@Valid @RequestBody RegisterRequest registerRequest) throws EmailAlreadyExistsException, InvalidRoleIdException {
        User RegisteredUser=authenticationService.registerUser(registerRequest);
        return new ResponseEntity<>(RegisteredUser, HttpStatus.ACCEPTED);
    }
    @PostMapping("/login")
    public ResponseEntity<Object> login(@Valid @RequestBody()  LoginRequest loginRequest) throws Exception {
        Map<String ,String> refreshAndAccess=authenticationService.login(loginRequest.getEmail(), loginRequest.getPassword());
        return new ResponseEntity<>(refreshAndAccess, HttpStatus.ACCEPTED);
    }
    @PostMapping("/refresh")
    public ResponseEntity<Object> refresh(@Valid @RequestBody RefreshRequest refreshRequest) throws InvalidRefreshTokenException, UnauthorizedAccessException {
        Map<String ,String> accessTokenObject=authenticationService.refresh(refreshRequest.getRefreshToken());
        return new ResponseEntity<>(accessTokenObject,HttpStatus.ACCEPTED);
    }
    @PostMapping("/logout")
    public ResponseEntity<Object> logout(@RequestBody LogoutRequest logoutRequest) throws FailedToLogoutException {
        authenticationService.logout(logoutRequest.getAccessToken());
        return new ResponseEntity<>(Collections.emptyList(),HttpStatus.ACCEPTED);
    }
}
