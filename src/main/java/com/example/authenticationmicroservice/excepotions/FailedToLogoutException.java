package com.example.authenticationmicroservice.excepotions;

public class FailedToLogoutException extends MyCustomExceptions{
    public FailedToLogoutException(){
        super("Logout Failed!");
    }
}
