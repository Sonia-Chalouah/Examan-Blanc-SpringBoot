package com.example.soniachalouahexblanc.Services.Voyageur;

import com.example.soniachalouahexblanc.DAO.Entities.Voyageur;

import java.util.List;
import java.util.Map;

public interface IVoyageurService {
    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);
    Map<Integer, List<Voyageur>> getVoyageByVol();
}
