package com.fitman.javafitman.Controller;

import com.fitman.javafitman.Model.Exercices_Sport;
import com.fitman.javafitman.Model.Utilisateur;
import com.fitman.javafitman.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExoSportController {

    @Autowired
    UtilisateurService utilisateurservice;

    @RequestMapping("/fitmansport")
    public Exercices_Sport fitman(@RequestParam(value="id") Integer idUtilisateur)throws Exception {
        return utilisateurservice.suggestionSport(idUtilisateur);
    }
}
