package com.example.cms.controller.exceptions;

public class RecommendationNotFoundException extends RuntimeException{
    public RecommendationNotFoundException(String id) {
        super("Could not find recommendation");
    }
}
