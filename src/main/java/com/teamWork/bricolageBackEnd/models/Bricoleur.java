package com.teamWork.bricolageBackEnd.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bricoleur extends User {
    @ManyToOne
    private Metier metier ;
    // private photo ;
    private int anneExperience;
    // private diplome;
    private int note ;

}
