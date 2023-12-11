package com.example.soniachalouahexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Reservation")
public class Reservation {
    @Id
    String idReservation;
    Date dateReservation;
    @Enumerated(EnumType.STRING)
    ClassPlace classPlace;
    @Enumerated(EnumType.STRING)
    EtatReservation etatReservation;


    @ManyToOne
    private Voyageur voyageur;
    @ManyToOne
    private Vol vol;

}
