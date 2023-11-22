package com.example.cms.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "emailMessages")
//TODO
public class Email {
    @Id
    @NotEmpty
    private Long emailMessageId;

    @NotEmpty
    private String emailMessage;

    @ManyToOne
    @JoinColumn(name="username")
    private User appUser;

    @OneToOne
    @JoinColumn(name = "recommendationId")
    private Recommendation recommendation;









    public Email(Long emailMessageId, int sleepAmount, String emailMessage, User appUser, Recommendation recommendation, Activity activity){
        this.emailMessageId = emailMessageId;
        this.emailMessage = emailMessage;
        this.appUser = appUser;
        this.recommendation = recommendation;
    }

}
