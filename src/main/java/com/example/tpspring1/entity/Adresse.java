package com.example.tpspring1.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Column(name = "rue")
    @Size(max=50)
    private String rue;
    @NotNull
    @Column(name = "complement")
    @Size(max=50)
    private String complement;
    @NotNull
    @Column(name = "complement")
    @Size(max=50)
    private String zipCode;
    private String ville;
    private String pays;

    public Adresse(long id, String rue, String complement, String zipCode, String ville, String pays) {
        this.id = id;
        this.rue = rue;
        this.complement = complement;
        this.zipCode = zipCode;
        this.ville = ville;
        this.pays = pays;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
