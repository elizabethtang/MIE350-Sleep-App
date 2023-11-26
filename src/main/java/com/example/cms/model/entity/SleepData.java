package com.example.cms.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.text.MessageFormat;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "sleepDatas")
public class SleepData {

    @Id
    @NotEmpty
    private Long SleepDataId;


    @ManyToOne
    @JoinColumn(name = "user_Username")
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

    @NotNull
    private int startTiredness;

    @NotNull
    private int endTiredness;

    @Nullable
    private String Dream; // user doesn't have to put any dream notes

    public SleepData(Long SleepDataId, User user, int startHour, int startMinute, int endHour, int endMinute, int startDay, int endDay, int startMonth, int endMonth, int startYear, int endYear, int startTiredness, int endTiredness, String dream) {
        this.SleepDataId = SleepDataId;
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
        this.startTiredness = startTiredness;
        this.endTiredness = endTiredness;
        this.Dream = dream;


    }

    public String getSleepDetails() {
        String template = "Sleep Data:\n" +
                "SleepDataId: {0}\n" +
                "User: {1}\n" +
                "Start Time: {2}:{3}\n" +
                "End Time: {4}:{5}\n" +
                "Start Date: {6}/{7}/{8}\n" +
                "End Date: {9}/{10}/{11}\n" +
                "Start Tiredness: {12}\n" +
                "End Tiredness: {13}\n" +
                "Dream: {14}";

        return MessageFormat.format(
                template,
                SleepDataId,
                user,
                startHour, startMinute,
                endHour, endMinute,
                startDay, startMonth, startYear,
                endDay, endMonth, endYear,
                startTiredness,
                endTiredness,
                Dream
        );
    }
}

