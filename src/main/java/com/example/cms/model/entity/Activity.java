package com.example.cms.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "activityData")
public class Activity {

    @Id
    @NotEmpty
    private Long ActivityID;

    @ManyToOne
    @JoinColumn(name="user_Username")
    private User user;

    @NotNull
    private int time; //how much time an activity took

    @NotNull
    private int date; //date displayed in the YYYYMMDD form (so that the latest date is always the greatest number)

    @Nullable
    private String userFeel; // how the user feels after the activity happened

    // the next set of variables are dependent on what kind of activity a user is logging and are therefore nullable
    // for example, a user doesn't have to intake caffeine for it to count as an activity (can instead burn calories)
    @Nullable
    private int caffeineIntake;

    @Nullable
    private int calorieIntake;

    @Nullable
    private int calorieBurn;

    @Nullable
    private String activitiesForToday;

    public Activity(Long ActivityID, User user, int time, int date , String userFeel, int caffeineIntake, int calorieBurn, int calorieIntake, String activitiesForToday){
        this.ActivityID = ActivityID;
        this.user = user;
        this.time = time;
        this.date = date;
        this.userFeel = userFeel;
        this.caffeineIntake = caffeineIntake;
        this.calorieBurn = calorieBurn;
        this.activitiesForToday = activitiesForToday;
        this.calorieIntake = calorieIntake;
    }

}

