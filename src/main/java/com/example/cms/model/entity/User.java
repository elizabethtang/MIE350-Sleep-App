package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
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

    @NotEmpty
    private int month;

    @NotEmpty
    private int  day;

    @NotEmpty
    private int year;

    @NotEmpty
    private String password;

    public User(String username, String first, String last, String email, int month, int day, int year,String pass){
        this.username = username;
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.password = pass;
    }


}
