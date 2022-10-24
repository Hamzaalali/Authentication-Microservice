package com.example.authenticationmicroservice.excepotions;

public class InvalidRefreshTokenException extends MyCustomExceptions{
    public InvalidRefreshTokenException() {
        super("Invalid refresh Token!");
    }
}
