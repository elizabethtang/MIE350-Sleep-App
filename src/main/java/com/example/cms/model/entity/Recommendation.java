package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "recommendations")
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendationId;

    @NotNull
    private int sleepAmount;

    @ManyToOne
    @JoinColumn(name = "username")
    private User appUser;

    public Recommendation(int sleepAmount, User appUser) {
        this.sleepAmount = sleepAmount;
        this.appUser = appUser;
    }
}
