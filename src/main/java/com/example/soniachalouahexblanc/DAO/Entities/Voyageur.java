package com.example.soniachalouahexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Voyageur")
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVoyageur;
    String nom;
    String prenom;
    Date dateNaissance;

    @OneToMany(mappedBy = "reservation")
    private List<Reservation> reservations=new ArrayList<>();
}
