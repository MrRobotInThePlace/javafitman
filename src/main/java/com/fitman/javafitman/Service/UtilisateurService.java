package com.fitman.javafitman.Service;

import com.fitman.javafitman.Model.Exercices_Sport;
import com.fitman.javafitman.Model.Utilisateur;
import com.fitman.javafitman.Repository.ExercicesSportRepository;
import com.fitman.javafitman.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private ExercicesSportRepository exercicesSportRepository;

    public Exercices_Sport suggestionSport(Integer idUtilisateur) {

        /* ALGO



        */
        
        Exercices_Sport ex = exercicesSportRepository.findOne(2);

        return ex;
    }
}
