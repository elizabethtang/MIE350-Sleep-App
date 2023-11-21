package com.example.cms.controller;

import com.example.cms.controller.exceptions.RecommendationNotFoundException;
import com.example.cms.model.entity.Recommendation;
import com.example.cms.model.entity.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class RecommendationController {
    @Autowired
    private final RecommendationRepository repository;

    public RecommendationController(RecommendationRepository repository) {
        this.repository = repository;
    }

    //FIX THIS UUID.randomUUID()
    public void save(String username, int sleepRecommendation) {
        long placeholder = 1;
        Recommendation recommendation = new Recommendation(placeholder, sleepRecommendation, username);
        Recommendation newRecommendation = repository.save(recommendation);
    }

    @GetMapping("/recommendation/{username}")
    public Recommendation getRecommendation(@PathVariable("username") String username) {
        //give most recent recommendation
        Recommendation recommendation = repository.getRecentRecommendation(username);

        if (recommendation == null) {
            throw new RecommendationNotFoundException(username);
        }
        return recommendation;
    }



}
