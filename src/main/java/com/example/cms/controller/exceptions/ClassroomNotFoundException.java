package com.example.cms.controller.exceptions;

public class ClassroomNotFoundException extends RuntimeException{
    public ClassroomNotFoundException(String classroomID) {
        super("Could not find classroom " + classroomID);
    }
}
