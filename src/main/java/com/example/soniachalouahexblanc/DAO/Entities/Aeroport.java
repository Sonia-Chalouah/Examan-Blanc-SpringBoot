package com.example.soniachalouahexblanc.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Aeroport")
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAeroport;
    @Setter(AccessLevel.NONE)
    String nom;
    String codeAITA;
    long telephone;


    @OneToMany(mappedBy = "arrive")
    private List<Vol> arrive=new ArrayList<>();

    @OneToMany(mappedBy = "depart")
    private List<Vol> depart=new ArrayList<>();




}
