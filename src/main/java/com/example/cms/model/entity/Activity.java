package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "activityData")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityID;

    @ManyToOne
    @JoinColumn(name = "user_Username")
    private User user;

    @NotNull
    private int time; // how much time an activity took

    @NotNull
    private LocalDate date; // date displayed in the YYYYMMDD form (so that the latest date is always the greatest number)

    @NotEmpty
    private String userFeel; // how the user feels after the activity happened

    // the next set of variables are dependent on what kind of activity a user is logging and are therefore nullable
    // for example, a user doesn't have to intake caffeine for it to count as an activity (can instead burn calories)
    @Nullable
    private Integer caffeineIntake;

    @Nullable
    private Integer calorieIntake;

    @Nullable
    private Integer calorieBurn;

    @Nullable
    private String activitiesForToday;

    public Activity(User user, int time, LocalDate date, String userFeel, Integer caffeineIntake, Integer calorieBurn, Integer calorieIntake, String activitiesForToday) {
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

