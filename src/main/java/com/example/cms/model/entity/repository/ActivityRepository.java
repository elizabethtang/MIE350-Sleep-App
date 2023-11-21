package com.example.cms.model.entity.repository;

import com.example.cms.model.entity.Activity;
import com.example.cms.model.entity.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    Activity getActivityByDate(Long date);

    void delete(Activity activity);
}
