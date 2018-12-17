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
        if (u2 == null) {
            throw new Exception("L'utilisateur n'existe pas");
        } else {

            Boolean niveau_sport = u2.getNiveauSport();
            Integer taille = u2.getTaille();
            Integer poids = u2.getPoids();

            if (niveau_sport) {

                if (taille < 170) {

                    if (poids < 70) {
                        return exercicesSportRepository.findByNom("Abdos");
                    }
                    if (poids >= 70 && poids < 90) {
                        return exercicesSportRepository.findByNom("Abdos");
                    }
                    if (poids >= 90) {
                        return exercicesSportRepository.findByNom("Squats");
                    }
                }

                if (taille >= 170 && taille < 185) {

                    if (poids < 70) {
                        return exercicesSportRepository.findByNom("Abdos");
                    }
                    if (poids >= 70 && poids < 90) {
                        return exercicesSportRepository.findByNom("Squats");
                    }
                    if (poids >= 90) {
                        return exercicesSportRepository.findByNom("Running");
                    }
                }

                if (taille >= 185) {

                    if (poids < 70) {
                        return exercicesSportRepository.findByNom("Abdos");
                    }
                    if (poids >= 70 && poids < 90) {
                        return exercicesSportRepository.findByNom("Running");
                    }
                    if (poids >= 90) {
                        return exercicesSportRepository.findByNom("Dips");
                    }
                }
            } else {
                if (taille < 170) {

                    if (poids < 70) {
                        return exercicesSportRepository.findByNom("Squats");
                    }
                    if (poids >= 70 && poids < 90) {
                        return exercicesSportRepository.findByNom("Running");
                    }
                    if (poids >= 90) {
                        return exercicesSportRepository.findByNom("Dips");
                    }
                }

                if (taille >= 170 && taille < 185) {

                    if (poids < 70) {
                        return exercicesSportRepository.findByNom("Running");
                    }
                    if (poids >= 70 && poids < 90) {
                        return exercicesSportRepository.findByNom("Dips");
                    }
                    if (poids >= 90) {
                        return exercicesSportRepository.findByNom("Gainage");
                    }
                }

                if (taille >= 185) {

                    if (poids < 70) {
                        return exercicesSportRepository.findByNom("Fente avant");
                    }
                    if (poids >= 70 && poids < 90) {
                        return exercicesSportRepository.findByNom("Jump");
                    }
                    if (poids >= 90) {
                        return exercicesSportRepository.findByNom("pompes");
                    }
                }
            }
            return null;
        }
    }
}

