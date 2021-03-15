package com.teamWork.bricolageBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Metier {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    @OneToMany(mappedBy = "metier")
    @JsonIgnore
    private Collection<Bricoleur> bricoleurs;
}
