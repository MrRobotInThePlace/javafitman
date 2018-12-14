package com.fitman.javafitman.Model;

import com.fitman.javafitman.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExoSportController {

    @Autowired
    UtilisateurService utilisateurservice;

    //private static final String template2 = "l'utilisateur : %s a pour histo : ";

    @RequestMapping("/fitmansport")
    public Utilisateur fitman(@RequestParam(value="id") Integer id)throws Exception {
        return utilisateurservice.findById(id);
    }
}
