package com.example.cms.model.repository;

import com.example.cms.model.entity.Activity;
import com.example.cms.model.entity.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    //TODO
    //List<Activity> activityDuration(String username, String date);


/*
    @Query(value = "select * from (USERS u INNER JOIN activityData a ON u.username = a.user_Username) where " +
            "ActivityID = '%', :activityId, '%' AND user_Username = '%', :username, '%' ", nativeQuery = true)
    List<Activity> getReferenceById(@Param("username") String username, @Param("activityId") long activityId);
*/

    @Query("SELECT a FROM Activity a WHERE a.user.username = :username AND a.date BETWEEN :startDate AND :endDate ORDER BY a.date ASC")
    List<Activity> activityDuration(
            @Param("username") String username,
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate
    );

}