package com.example.soniachalouahexblanc.Services.Voyageur;

import com.example.soniachalouahexblanc.DAO.Entities.Voyageur;
import com.example.soniachalouahexblanc.DAO.Repositories.VoyageurRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VoyageurService implements IVoyageurService{
    VoyageurRepo voyageurRepo;
    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyageurRepo.saveAll(voyageurs);
    }

    @Override
    public Map<Integer, List<Voyageur>> getVoyageByVol() {
        return null;
    }
}
