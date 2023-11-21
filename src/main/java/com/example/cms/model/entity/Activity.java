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
    private int startHour;

    @NotNull
    private int startMinute;

    @NotNull
    private int endHour;

    @NotNull
    private int endMinute;

    @NotNull
    private int startDay; // account for 31 - 1

    @NotNull
    private int endDay;

    @NotNull
    private int startMonth;

    @NotNull
    private int endMonth;

    @NotNull
    private int startYear;

    @NotNull
    private int endYear;

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
    private String exerciseType;


    public Activity(Long ActivityID, int startDay, int endDay, int startMonth, int endMonth, int startYear, int endYear, User user, int startHour, int startMinute,  int endHour, int endMinute, String userFeel, int caffeineIntake, int calorieBurn, int calorieIntake, String exerciseType){
        this.ActivityID = ActivityID;
        this.user = user;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
        this.startDay = startDay;
        this.endDay = endDay;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.startYear = startYear;
        this.endYear = endYear;
        this.userFeel = userFeel;
        this.caffeineIntake = caffeineIntake;
        this.calorieBurn = calorieBurn;
        this.exerciseType = exerciseType;
        this.calorieIntake = calorieIntake;





    }


}

