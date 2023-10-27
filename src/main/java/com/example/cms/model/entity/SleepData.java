package com.example.cms.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "sleepdata")
public class SleepData {

    @Id
    @NotEmpty
    private Long SleepDataId;



    @ManyToOne
    @JoinColumn(name="userUsername")
    private User user;




    /*
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "courseCode")
    @JsonIgnoreProperties({"marks"})
    private Course course;
    */

    @NotNull
    private int starthour;

    @NotNull
    private int startminute;

    @NotNull
    private int endhour;

    @NotNull
    private int endminute;

    @NotNull
    private int startday; // account for 31 - 1

    @NotNull
    private int endday;

    @NotNull
    private int startmonth;

    @NotNull
    private int endmonth;

    @NotNull
    private int startyear;

    @NotNull
    private int endyear;

    @NotNull
    private int starttiredness;

    @NotNull
    private int endtiredness;

    private String dream; // user doesn't have to put any dream notes



}

