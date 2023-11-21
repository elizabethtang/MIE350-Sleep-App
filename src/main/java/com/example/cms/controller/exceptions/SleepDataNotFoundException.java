package com.example.cms.controller.exceptions;

public class SleepDataNotFoundException extends RuntimeException{
    public SleepDataNotFoundException(String id) {
        super("Could not find sleep data");
    }
}
