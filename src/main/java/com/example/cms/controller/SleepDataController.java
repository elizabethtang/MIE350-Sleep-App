package com.example.cms.controller;

import com.example.cms.controller.exceptions.SleepDataNotFoundException;
import com.example.cms.model.entity.Recommendation;
import com.example.cms.model.entity.SleepData;
import com.example.cms.model.repository.SleepDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Random;

@CrossOrigin
@RestController
public class SleepDataController {
    @Autowired
    private final SleepDataRepository repository;
    private final EmailController emailController;
    private RecommendationController recommendationController;

    public SleepDataController(SleepDataRepository repository, EmailController emailController) {
        this.repository = repository;
        this.emailController = emailController;
    }

    @PostMapping("/sleep/create/{username}")
    public ResponseEntity<String> addSleep(@PathVariable("username") String username, @RequestBody SleepData sleepData) {
        try {
            // Add new sleep data
            Random random = new Random();

            // Generate a random long value
            long sleepDataId = random.nextLong();
            sleepData.setSleepDataId(sleepDataId);
            SleepData data = repository.save(sleepData);

            // create new recommendation
            int sleepRecommendation = calculateSleepRecommendation();
            Recommendation recommendation = recommendationController.create(sleepData.getUser(), sleepRecommendation);

            // send email
            emailController.sendEmailWithRecommendation(sleepData.getUser().getEmail(), sleepData, recommendation);

            return ResponseEntity.ok("Sleep data saved successfully");
        } catch (Exception e) {
            // Handle exceptions and return an appropriate response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving sleep data: " + e.getMessage());
        }
    }

    private int calculateSleepRecommendation() {
        return 8;
    }

    @GetMapping("/sleep/{username}/{start}/{end}")
    List<SleepData> getSleepData(
            @PathVariable("username") String username,
            @PathVariable("start") String start,
            @PathVariable("end") String end) {
        // start date DD/MM/YY
        // end date DD/MM/YY
        List<SleepData> sleepDataList = repository.sleepDataDuration(username, start, end);
        if (sleepDataList.isEmpty()) {
            throw new SleepDataNotFoundException(username);
        }
        return sleepDataList;
    }


    @GetMapping("/sleep/{username}/{sleepDataId}")
    SleepData getSleepData
            (@PathVariable("username") String username, @PathVariable("sleepDataId") Long
                    sleepDataId) {
        return repository.getReferenceById(sleepDataId);
    }

    @DeleteMapping("/sleep/{username}/{sleepDataId}")
    public String deleteSleepData(
            @PathVariable String username,
            @PathVariable Long sleepDataId) {

        if (!repository.existsById(sleepDataId)) {
            throw new SleepDataNotFoundException(username);
        }
        repository.deleteById(sleepDataId);
        return "Successfully deleted entry!";
    }
}