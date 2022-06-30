package com.example.tpspring1.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import java.util.Date;

public class Formateur extends Personne{
    @NotNull
    @Column(name = "dateEmbauche")
    private Date dateEmbauche;
    @NotNull
    @Column(name = "exp")
    private int exp;

    private boolean interne;

    public Formateur(long id, String type, String civilite, String nom, String prenom, String email, String idAdresse, Date dateEmbauche, int exp, boolean interne) {
        super(id, type, civilite, nom, prenom, email, idAdresse);
        this.dateEmbauche = dateEmbauche;
        this.exp = exp;
        this.interne = interne;
    }

    public Formateur(long id, String type, String civilite, String nom, String prenom, String email, String idAdresse) {
        super(id, type, civilite, nom, prenom, email, idAdresse);
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public boolean isInterne() {
        return interne;
    }

    public void setInterne(boolean interne) {
        this.interne = interne;
    }
}
