package com.example.tpspring1.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(name = "nom")
    @Size(max=50)
    private String nom;
    @NotNull
    @Column(name = "duree")
    private int duree;
    @NotNull
    @Column(name = "difficulté")
    @Size(max=50)
    private String difficulte;

    @ManyToMany@JoinTable(name="competence",uniqueConstraints=@UniqueConstraint(columnNames={ "FORMATEUR_ID", "MATIERE_ID" }),joinColumns=@JoinColumn(name="FORMATEUR_ID", referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="MATIERE_ID", referencedColumnName="id"))
    private List<Formateur> formateurs;

    public Matiere() {
    }

    public Matiere(long id, String nom, int duree, String difficulte) {
        this.id = id;
        this.nom = nom;
        this.duree = duree;
        this.difficulte = difficulte;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }
}
