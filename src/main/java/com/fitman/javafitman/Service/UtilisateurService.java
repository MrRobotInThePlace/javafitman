package com.fitman.javafitman.Service;

import com.fitman.javafitman.Model.Exercices_Sport;
import com.fitman.javafitman.Model.Utilisateur;
import com.fitman.javafitman.Repository.ExercicesSportRepository;
import com.fitman.javafitman.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService extends Utilisateur {

    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private ExercicesSportRepository exercicesSportRepository;


    public Exercices_Sport suggestionSport(Integer idUtilisateur) throws Exception {
        Utilisateur u2 = utilisateurRepository.findOne(idUtilisateur);
        Boolean niveau_sport = u2.getNiveauSport();
        Integer taille = u2.getTaille();
        Integer poids = u2.getPoids();
        if (u2 == null) {
            throw new Exception("L'utilisateur n'existe pas");
        }
        if (niveau_sport == true) {
            if (taille < 170) {

                if (poids < 70) {
                    return exercicesSportRepository.findOne(1);
                }
                if (poids >= 70 && poids < 90) {
                    return exercicesSportRepository.findOne(2);
                }
                if (poids >= 90) {
                    return exercicesSportRepository.findOne(3);
                }
            }

            if (taille >= 170 && taille < 185) {

                if (poids < 70) {
                    return exercicesSportRepository.findOne(1);
                }
                if (poids >= 70 && poids < 90) {
                    return exercicesSportRepository.findOne(3);
                }
                if (poids >= 90) {
                    return exercicesSportRepository.findOne(4);
                }
            }

            if (taille >= 185) {

                if (poids < 70) {
                    return exercicesSportRepository.findOne(2);
                }
                if (poids >= 70 && poids < 90) {
                    return exercicesSportRepository.findOne(4);
                }
                if (poids >= 90) {
                    return exercicesSportRepository.findOne(5);
                }
            }
        }

        if (niveau_sport == false) {
            if (taille < 170) {

                if (poids < 70) {
                    return exercicesSportRepository.findOne(3);
                }
                if (poids >= 70 && poids < 90) {
                    return exercicesSportRepository.findOne(4);
                }
                if (poids >= 90) {
                    return exercicesSportRepository.findOne(5);
                }
            }

            if (taille >= 170 && taille < 185) {

                if (poids < 70) {
                    return exercicesSportRepository.findOne(4);
                }
                if (poids >= 70 && poids < 90) {
                    return exercicesSportRepository.findOne(5);
                }
                if (poids >= 90) {
                    return exercicesSportRepository.findOne(6);
                }
            }

            if (taille >= 185) {

                if (poids < 70) {
                    return exercicesSportRepository.findOne(7);
                }
                if (poids >= 70 && poids < 90) {
                    return exercicesSportRepository.findOne(8);
                }
                if (poids >= 90) {
                    return exercicesSportRepository.findOne(9);
                }
            }
        }
        return exercicesSportRepository.findOne(1);
    }
}