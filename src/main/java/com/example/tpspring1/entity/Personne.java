package com.example.tpspring1.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE")
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(name = "type")
    @Size(max=5)
    private String type;
    @NotNull
    @Column(name = "civilite")
    @Size(max=50)
    private String civilite;
    @NotNull
    @Column(name = "nom")
    @Size(max=50)
    private String nom;
    @NotNull
    @Column(name = "prenom")
    @Size(max=50)
    private String prenom;
    @NotNull
    @Column(name = "email")
    @Size(max=50)
    private String email;
    @NotNull
    @ManyToOne
    private Adresse adresse;

    public Personne(long id, String type, String civilite, String nom, String prenom, String email, Adresse idAdresse) {
        this.id = id;
        this.type = type;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = idAdresse;
    }

    public Personne() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse idAdresse) {
        this.adresse = idAdresse;
    }
}


