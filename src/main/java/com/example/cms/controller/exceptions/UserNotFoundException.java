package com.example.cms.controller.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long userId) {
        super("Incorrect username or password");
    }
}
