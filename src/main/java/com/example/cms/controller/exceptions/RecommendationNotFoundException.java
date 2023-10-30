package com.example.cms.controller.exceptions;

public class RecommendationNotFoundException extends RuntimeException{
    public RecommendationNotFoundException(Long id) {
        super("Could not find recommendation");
    }
}
