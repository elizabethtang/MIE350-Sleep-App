package com.example.cms.controller;

import com.example.cms.controller.exceptions.ActivityNotFoundException;
import com.example.cms.model.entity.Activity;
import com.example.cms.model.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
        // Generate a random long value
        Activity data = repository.save(activity);
        return "Activity saved successfully";
    }

//    @GetMapping("/activity/{username}/{date}")
//    List<Activity> getActivity(
//            @PathVariable("username") String username,
//            @PathVariable("date") int date) {
//        // date YYYYMMDD
//        List<Activity> activityList = repository.activityDuration(username, startDate, endDate);
//        if (activityList.isEmpty()) {
//            throw new ActivityNotFoundException("No activities for this day");
//        }
//        return activityList;
//    }


    @GetMapping("/activity/{username}/{start}/{end}")
    List<Activity> getActivity(@PathVariable("username") String username,
                               @PathVariable("start") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
                               @PathVariable("end") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        // Assuming you have a method to find the activity by username and date in the repository
        List<Activity> activity = repository.activityDuration(username, startDate, endDate);

        // Check if the activity is found
        if (activity == null) {
            // Handle the case when the activity is not found
            throw new ActivityNotFoundException(username);
        }
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
