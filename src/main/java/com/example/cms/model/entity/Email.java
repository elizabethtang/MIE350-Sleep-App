package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "emailMessages")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emailMessageId;

    @NotEmpty
    private String emailMessage;

    @ManyToOne
    @JoinColumn(name = "username")
    private User appUser;

    @OneToOne(cascade = CascadeType.ALL) // Specify the cascade type as needed
    @JoinColumn(name = "recommendationId")
    private Recommendation recommendation;

    public Email(String emailMessage, User appUser, Recommendation recommendation) {
        this.emailMessage = emailMessage;
        this.appUser = appUser;
        this.recommendation = recommendation;
    }
}
