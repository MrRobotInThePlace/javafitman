package com.fitman.javafitman.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "executer")
public class Executer implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "Id_Executer")
    private Integer Id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "Code_Utilisateur_Executer")
    private Utilisateur utilisateur;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "Code_Sport_Executer")
    private Exercices_Sport exercices_sport;

    @Column (name = "Date_Executer")
    private Date executerDate;


    public Utilisateur getUtilisateur(){
        return utilisateur;
    }

    public void setUtilisateur (Utilisateur utilisateur){
        this.utilisateur = utilisateur;
    }


    public Exercices_Sport getExercicesSport(){
        return exercices_sport;
    }

    public void setExercices_sport (Exercices_Sport exercices_sport){
        this.exercices_sport = exercices_sport;
    }

    @Column(name = "date_executer_sport")
    public Date getExecuterDate(){
        return executerDate;
    }

    /* public Executer() {
    }

    public Executer(Integer id, Utilisateur utilisateur, Exercices_Sport exercices_sport, Date executerDate) {
        this.utilisateur = utilisateur;
        this.exercices_sport = exercices_sport;
        this.executerDate = executerDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Exercices_Sport getExercices_sport() {
        return exercices_sport;
    }

    public void setExecuterDate(Date executerDate) {
        this.executerDate = executerDate;
    } */
}
