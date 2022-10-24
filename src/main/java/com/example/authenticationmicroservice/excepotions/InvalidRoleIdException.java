package com.example.authenticationmicroservice.excepotions;

public class InvalidRoleIdException extends MyCustomExceptions{
    public InvalidRoleIdException(){
        super("Invalid Role ID!");
    }
}
