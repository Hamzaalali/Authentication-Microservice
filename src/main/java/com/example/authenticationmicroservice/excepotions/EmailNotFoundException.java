package com.example.authenticationmicroservice.excepotions;

public class EmailNotFoundException extends MyCustomExceptions{
    public EmailNotFoundException(){
        super("Email Not Found!");
    }
}
