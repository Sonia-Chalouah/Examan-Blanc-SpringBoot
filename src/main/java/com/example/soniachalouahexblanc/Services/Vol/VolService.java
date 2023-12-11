package com.example.soniachalouahexblanc.Services.Vol;

import com.example.soniachalouahexblanc.DAO.Entities.Aeroport;
import com.example.soniachalouahexblanc.DAO.Entities.Vol;
import com.example.soniachalouahexblanc.DAO.Repositories.VolRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VolService implements IVolService{
    VolRepo volRepo;

    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        List<Vol> arrive=new ArrayList<>();
        List<Vol> depart=new ArrayList<>();



        volRepo.save(vol);


        return "le vol est ajouté avec succes" ;
    }
}
