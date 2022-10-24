package com.example.authenticationmicroservice.requests;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class LoginRequest {
    @NotEmpty(message = "Email can't be empty")
    String email;
    @NotEmpty (message = "Password can't be empty")
    String password;
}
