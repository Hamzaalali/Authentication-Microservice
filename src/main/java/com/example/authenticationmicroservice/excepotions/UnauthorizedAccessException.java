package com.example.authenticationmicroservice.excepotions;

public class UnauthorizedAccessException extends MyCustomExceptions{
    public UnauthorizedAccessException(){
        super("Unauthorized Access!");
    }
}
