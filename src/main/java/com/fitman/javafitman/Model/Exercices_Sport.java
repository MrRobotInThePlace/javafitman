package com.fitman.javafitman.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "exercices_sport")
public class Exercices_Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column (name = "Id_Sport")
    private Integer Id;

    @Column (name = "Nom_Sport")
    private String nom;

    @Column (name = "Descriptif_Sport")
    private String descriptif;

    @Column (name = "Duree_Sport")
    private Integer duree;

    @Column (name = "Materiel_Sport")
    private String materiel;

    @OneToMany(mappedBy = "exercices_sport")
    @JsonManagedReference
    private Set<Executer> executerSports;


    public Set<Executer>   getExecuterSports() {
        return executerSports;
    }

    public void setExecuterSports(Set<Executer> executerSports) {
        this.executerSports = executerSports;
    }

    public Exercices_Sport() {
    }

    public Exercices_Sport(String nom, String descriptif, Integer duree, String materiel) {
        this.nom = nom;
        this.descriptif = descriptif;
        this.duree = duree;
        this.materiel = materiel;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }
}
