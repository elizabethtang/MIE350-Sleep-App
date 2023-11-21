package com.example.cms.controller;

import com.example.cms.controller.exceptions.SleepDataNotFoundException;
import com.example.cms.model.entity.SleepData;
import com.example.cms.model.entity.repository.SleepDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SleepDataController {
    @Autowired
    private final SleepDataRepository repository;
    private RecommendationController recommendationController;

    public SleepDataController(SleepDataRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/sleep/create/{username}")
    public String addSleep(@PathVariable("username") String username, @RequestBody SleepData sleepData) {
        // Add new sleep data
        SleepData data = repository.save(sleepData);
        //create new recommendation
        int sleepRecommendation = calculateSleepRecommendation();
        //FIX THIS HOW ARE WE MAKING RECOMMENDATIONS
        recommendationController.save(username, sleepRecommendation);
        return "Sleep data saved successfully";
    }

    private int calculateSleepRecommendation() {
        return 8;
    }

    @GetMapping("/sleep/{username}/{start}/{end}")
    List<SleepData> getSleepData(
            @PathVariable("username") String username,
            @PathVariable("start") String start,
            @PathVariable("end") String end,
            @RequestParam(name = "duration", defaultValue = "daily") String duration) {
        // start date DD/MM/YY
        // end date DD/MM/YY
        switch (duration) {
            case "daily":
                // Get daily sleep data
                return repository.dailySleep(username, start, end);
            case "weekly":
                // Get weekly sleep data
                return repository.weeklySleep(username, start, end);
            case "monthly":
                // Get monthly sleep data
                return repository.monthlySleep(username, start, end);
            default:
                throw new SleepDataNotFoundException(username);
        }
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