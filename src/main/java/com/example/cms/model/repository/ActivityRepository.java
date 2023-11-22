package com.example.cms.model.repository;

import com.example.cms.model.entity.Activity;
import com.example.cms.model.entity.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    //TODO
    List<Activity> activityDuration(String username, String start, String end);
}