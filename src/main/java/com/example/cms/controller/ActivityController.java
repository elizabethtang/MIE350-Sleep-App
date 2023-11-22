package com.example.cms.controller;

import com.example.cms.controller.exceptions.ActivityNotFoundException;
import com.example.cms.model.entity.Activity;
import com.example.cms.model.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

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
        Random random = new Random();
        // Generate a random long value
        long activityId = random.nextLong();
        activity.setActivityID(activityId);
        Activity data = repository.save(activity);
        return "Activity saved successfully";
    }

    //FIX THIS
    @GetMapping("/activity/{username}/{start}/{end}")
    List<Activity> getActivity(
            @PathVariable("username") String username,
            @PathVariable("start") String start,
            @PathVariable("end") String end) {
        // start date DD/MM/YY
        // end date DD/MM/YY
        List<Activity> activityList = repository.activityDuration(username, start, end);
        if (activityList.isEmpty()) {
            throw new ActivityNotFoundException("No activities for this day");
        }
        return activityList;
    }


    @GetMapping("/activity/{username}/{activityId}")
    Activity getActivity
            (@PathVariable("username") String username, @PathVariable("activityId") Long
                    activityId) {
        Activity activity = repository.getReferenceById(activityId);

        return activity;
    }

    @DeleteMapping("/activity/{username}/{activityId}")
    public String deleteActivity(
            @PathVariable("username") String username,
            @PathVariable("activityId") Long activityId) {
        Activity activity = repository.getReferenceById(activityId);
        repository.delete(activity);
        return "Successfully deleted activity!";
    }
}
