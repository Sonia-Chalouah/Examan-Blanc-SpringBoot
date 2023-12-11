package com.example.soniachalouahexblanc.Services.Reservation;

import com.example.soniachalouahexblanc.DAO.Entities.ClassPlace;
import com.example.soniachalouahexblanc.DAO.Entities.Reservation;
import com.example.soniachalouahexblanc.DAO.Entities.Vol;
import com.example.soniachalouahexblanc.DAO.Entities.Voyageur;
import com.example.soniachalouahexblanc.DAO.Repositories.ReservationRepo;
import com.example.soniachalouahexblanc.DAO.Repositories.VolRepo;
import com.example.soniachalouahexblanc.DAO.Repositories.VoyageurRepo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService{
    VoyageurRepo voyageurRepo;
    VolRepo volRepo;
    ReservationRepo reservationRepo;
    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        int nbmaxplaceBusiness=2;
        int nbmaxplaceECONIMIQUE=3;

        Integer voyageurID = null;
        Voyageur v = voyageurRepo.findById(voyageurID).orElse(null);

        Vol vol= volRepo.findById(volId).orElse(null);

        Reservation reservations = new Reservation();
        reservations.setVoyageur(v);
        reservations.setVol(vol);

        return null;
    }

    @Override
    public Reservation confirmerReservation(String resId) {

        String EtatReservation = "CONFIRMEE";

        List<Voyageur> voyageurs=voyageurRepo.findAll();
        List<Reservation> reservations = (List<Reservation>) reservationRepo.findByEtatReservation();

        for( Voyageur voyageur: voyageurs){


        }

        return null;
    }



    @Override
    @Scheduled(cron = "*/60 * * * * *")
    public Void annulerReservation() {
        return null;
    }
}
