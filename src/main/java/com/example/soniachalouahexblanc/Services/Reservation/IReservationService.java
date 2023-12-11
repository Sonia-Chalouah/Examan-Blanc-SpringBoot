package com.example.soniachalouahexblanc.Services.Reservation;

import com.example.soniachalouahexblanc.DAO.Entities.ClassPlace;
import com.example.soniachalouahexblanc.DAO.Entities.Reservation;

public interface IReservationService {
    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);

    Reservation confirmerReservation(String resId);

    Void annulerReservation();
}
