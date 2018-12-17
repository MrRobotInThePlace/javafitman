package com.fitman.javafitman.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.*;

@Entity
@Table (name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column (name = "Id_Utilisateur")
    private Integer Id;

    @Column (name = "Nom_Utilisateur")
    private String nom;

    @Column (name = "Prenom_Utilisateur")
    private String prenom;

    @Column (name = "Pseudo_Utilisateur")
    private String pseudo;

    @Column (name = "Email_Utilisateur")
    private String email;

    @Column (name = "Mot_De_Passe_Utilisateur")
    private String mot_de_passe;

    @Column (name = "Date_Anniv_Utilisateur")
    private Date date_anniversaire;

    @Column (name = "Poids_Utilisateur")
    private Integer poids;

    @Column (name = "Taille_Utilisateur")
    private Integer taille;

    @Column (name = "Niveau_Sport_Utilisateur")
    private Boolean niveauSport;

    @Column (name = "Objectif_Utilisateur")
    private String objectif;

    @OneToMany(mappedBy = "utilisateur"/*, cascade = CascadeType.ALL, orphanRemoval = true*/, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Executer> executerSports;

    public Set<Executer>   getExecuterSports() {
        return executerSports;
    }

    public void setExecuterSports(Set<Executer> executerSports) {
        this.executerSports = executerSports;
    }

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String pseudo, String email, String mot_de_passe, Date date_anniversaire, Integer poids, Integer taille, Boolean niveauSport, String objectif) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.date_anniversaire = date_anniversaire;
        this.poids = poids;
        this.taille = taille;
        this.niveauSport = niveauSport;
        this.objectif = objectif;
        executerSports = new HashSet<>();
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public Date getDate_anniversaire() {
        return date_anniversaire;
    }

    public void setDate_anniversaire(Date date_anniversaire) {
        this.date_anniversaire = date_anniversaire;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public Boolean getNiveauSport() {
        return niveauSport;
    }

    public void setNiveauSport(Boolean niveauSport) {
        this.niveauSport = niveauSport;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }
}
