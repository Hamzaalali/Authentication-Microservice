package com.example.authenticationmicroservice.excepotions;

public class EmailAlreadyExistsException extends MyCustomExceptions{
    public EmailAlreadyExistsException(){
        super("Email Already Exists!");
    }
}
