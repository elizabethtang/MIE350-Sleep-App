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
@Table(name = "recommendations")

public class Recommendation {
    @Id
    @NotEmpty
    private Long recommendationId;

    @NotEmpty
    private int sleepAmount;

   // @ManyToOne
   // @JoinColumn(name="userUsername")
   // private User user;







    public Recommendation(Long Id, int sleepAmount, User user){
        this.recommendationId = Id;
        this.sleepAmount = sleepAmount;
        //this.user = user;
    }

}
