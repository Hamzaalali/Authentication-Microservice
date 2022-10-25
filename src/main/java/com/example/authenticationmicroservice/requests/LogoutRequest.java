package com.example.authenticationmicroservice.requests;

import lombok.Data;

@Data
public class LogoutRequest {
    String accessToken;
}
