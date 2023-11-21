package com.example.cms.controller;

import com.example.cms.controller.exceptions.ActivityNotFoundException;
import com.example.cms.controller.exceptions.SleepDataNotFoundException;
import com.example.cms.model.entity.Activity;
import com.example.cms.model.entity.SleepData;
import com.example.cms.model.entity.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ActivityController {
    @Autowired
    private final ActivityRepository repository;


    public ActivityController(ActivityRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/activity/{username}")
    public String addSleep(@PathVariable("username") String username, @RequestBody Activity activity) {
        // Add new sleep data
        Activity data = repository.save(activity);
        return "Activity saved successfully";
    }

    //FIX THIS
    @GetMapping("/activity/{username}/{start}/{end}")
    List<SleepData> getActivity(
            @PathVariable("username") String username,
            @PathVariable("start") String start,
            @PathVariable("end") String end,
            @RequestParam(name = "duration", defaultValue = "daily") String duration) {
        // start date DD/MM/YY
        // end date DD/MM/YY
        switch (duration) {
            case "daily":
                // Get daily sleep data
                return repository.dailyActivity(username, start, end);
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


    @GetMapping("/activity/{username}/{date}")
    Activity getActivity
            (@PathVariable("username") String username, @PathVariable("date") Long
                    date) {
        Activity activity = repository.getActivityByDate(date);

        if (activity == null) {
            throw new ActivityNotFoundException("No activity found for the specified date");
        }

        return activity;
    }

    @DeleteMapping("/activity/{username}/{date}")
    public String deleteActivity(
            @PathVariable String username,
            @PathVariable Long date) {
        Activity activity = repository.getActivityByDate(date);
        if (activity == null) {
            throw new ActivityNotFoundException("No activity found for the specified date");
        }
        repository.delete(activity);
        return "Successfully deleted activity!";
    }
}
