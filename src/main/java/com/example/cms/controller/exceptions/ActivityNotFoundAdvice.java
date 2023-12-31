package com.example.cms.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ActivityNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ActivityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String activityNotFoundHandler(ActivityNotFoundException ex) {
        return ex.getMessage();
    }
}
