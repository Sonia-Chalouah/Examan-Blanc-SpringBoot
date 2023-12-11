package com.example.soniachalouahexblanc.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
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
@Table(name = "Vol ")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVol ;
    LocalDate dateDepart;
    LocalDate dateArrive;

    @ManyToOne
    @JsonIgnore
    Aeroport  arrive;
    @ManyToOne
    @JsonIgnore
    Aeroport depart;

    @OneToMany(mappedBy = "reservation")
    private List<Reservation> reservations=new ArrayList<>();




}
