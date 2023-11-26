package com.example.cms.controller;

import com.example.cms.controller.exceptions.SleepDataNotFoundException;
import com.example.cms.model.entity.Recommendation;
import com.example.cms.model.entity.SleepData;
import com.example.cms.model.repository.SleepDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@CrossOrigin
@RestController
public class SleepDataController {
    @Autowired
    private final SleepDataRepository repository;
    private final EmailController emailController;
    private final RecommendationController recommendationController;

    public SleepDataController(SleepDataRepository repository, EmailController emailController, RecommendationController recommendationController) {
        this.repository = repository;
        this.emailController = emailController;
        this.recommendationController = recommendationController;
    }
    @Transactional
    @PostMapping("/sleep/create/{username}")
    public ResponseEntity<String> addSleep(@PathVariable("username") String username, @RequestBody SleepData sleepData) {
        try {
            System.out.println("start");
            // Add new sleep data
            Random random = new Random();
            System.out.println("creting");

            SleepData data = repository.save(sleepData);
            System.out.println("saved");

            // create new recommendation
            int sleepRecommendation = calculateSleepRecommendation();
            Recommendation recommendation = recommendationController.create(sleepData.getUser(), sleepRecommendation);
            System.out.println("recommendation");

            // send email
            emailController.sendEmailWithRecommendation(sleepData.getUser().getEmail(), sleepData, recommendation);
            System.out.println("emailed");

            return ResponseEntity.ok("Sleep data saved successfully");
        } catch (Exception e) {
            // Handle exceptions and return an appropriate response
            // Log the exception
            System.err.println("Error saving sleep data: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving sleep data: " + e.getMessage());
        }
    }

    private int calculateSleepRecommendation() {
        return 8;
    }

    @GetMapping("/sleep/{username}/{start}/{end}")
    List<SleepData> getSleepData(
            @PathVariable("username") String username,
            @PathVariable("start") @DateTimeFormat(pattern = "ddMMyyyy") LocalDate startDate,
            @PathVariable("end") @DateTimeFormat(pattern = "ddMMyyyy") LocalDate endDate) {
        List<SleepData> sleepDataList = repository.sleepDataDuration(username, startDate, endDate);
        if (sleepDataList.isEmpty()) {
            throw new SleepDataNotFoundException(username);
        }
        return sleepDataList;
    }


    @GetMapping("/sleep/{username}/{sleepDataId}")
    Optional<SleepData> getSleepData
            (@PathVariable("username") String username, @PathVariable("sleepDataId") Long
                    sleepDataId) {
        return repository.findById(sleepDataId);
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