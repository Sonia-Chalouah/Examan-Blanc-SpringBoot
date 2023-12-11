package com.example.soniachalouahexblanc.DAO.Repositories;

import com.example.soniachalouahexblanc.DAO.Entities.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VolRepo extends JpaRepository<Vol,Integer> {

    Optional<Vol> findById(Integer vollId);
}
