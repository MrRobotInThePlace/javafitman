package com.fitman.javafitman.Repository;

import com.fitman.javafitman.Model.Utilisateur;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Integer>{

    List<Utilisateur> findByNom (String nom);

    List<Utilisateur> findByPseudo (String pseudo);

    List<Utilisateur> findByNiveauSport (boolean niveau_sport);


}
