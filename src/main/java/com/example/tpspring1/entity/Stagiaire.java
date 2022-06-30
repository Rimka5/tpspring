package com.example.tpspring1.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Date;

public class Stagiaire extends Personne{
    @NotNull
    @Column(name = "dateNaissance")
    private Date dateNaissance;
    @OneToMany
    private Formateur formateur;

    public Stagiaire(long id, String type, String civilite, String nom, String prenom, String email, String idAdresse) {
        super(id, type, civilite, nom, prenom, email, idAdresse);
    }

    public Stagiaire(long id, String type, String civilite, String nom, String prenom, String email, String idAdresse, Date dateNaissance, Formateur formateur) {
        super(id, type, civilite, nom, prenom, email, idAdresse);
        this.dateNaissance = dateNaissance;
        this.formateur = formateur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }
}
