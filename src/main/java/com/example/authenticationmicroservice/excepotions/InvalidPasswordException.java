package com.example.authenticationmicroservice.excepotions;

public class InvalidPasswordException extends MyCustomExceptions{

    public InvalidPasswordException(){
        super("Invalid Password!");
    }
}
