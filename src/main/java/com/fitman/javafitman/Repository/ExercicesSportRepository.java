package com.fitman.javafitman.Repository;

import com.fitman.javafitman.Model.Exercices_Sport;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ExercicesSportRepository extends PagingAndSortingRepository<Exercices_Sport, Integer> {

    List<Exercices_Sport> findByNom (String nom);

}
