package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {


    @Id
    private String username; //username; question: do we want it to be integer or string

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @Email
    @NotEmpty
    private String email;

    @NotNull
    private int birthMonth;

    @NotNull
    private int birthDay;

    @NotNull
    private int birthYear;

    @NotEmpty
    private String password;

    @Nullable
    private Boolean emailToggle;
/*
    @OneToMany(mappedBy = "user")
    @Nullable
    private List<SleepData> sleeps  = new ArrayList<>();


    @OneToMany(mappedBy = "user")
    @Nullable
    private List<Recommendation> recommendations  = new ArrayList<>();
*/
    public User(String username, String first, String last, String email, int month, int day, int year,String pass){
        this.username = username;
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.birthMonth = month;
        this.birthDay = day;
        this.birthYear = year;
        this.password = pass;
        this.emailToggle = true;
    }
}
