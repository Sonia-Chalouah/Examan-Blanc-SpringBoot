package com.example.soniachalouahexblanc.DAO.Repositories;

import com.example.soniachalouahexblanc.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,String> {
    Reservation findByEtatReservation();
}
