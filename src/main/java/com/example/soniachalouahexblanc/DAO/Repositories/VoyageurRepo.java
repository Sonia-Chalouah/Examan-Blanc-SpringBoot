package com.example.soniachalouahexblanc.DAO.Repositories;

import com.example.soniachalouahexblanc.DAO.Entities.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoyageurRepo extends JpaRepository<Voyageur,Integer> {
    Optional<Voyageur> findById(Integer voyageurID);
}
