package com.example.cms.controller.exceptions;

public class UserAlreadyExistsException extends RuntimeException{

    public UserAlreadyExistsException() {
        super("Username already exists. User creation failed.");
    }

}
