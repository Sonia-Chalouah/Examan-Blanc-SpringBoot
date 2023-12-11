package com.example.soniachalouahexblanc.RestControllers;

import com.example.soniachalouahexblanc.DAO.Entities.Voyageur;
import com.example.soniachalouahexblanc.Services.Voyageur.IVoyageurService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoyageurController {
    IVoyageurService iVoyageurService;
    @PostMapping("/add")
    Voyageur add(@RequestBody List<Voyageur> voyageurs) {
        return (Voyageur) iVoyageurService.ajouterVoyageurs(voyageurs);
    }
}
