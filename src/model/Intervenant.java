package model;

import java.util.ArrayList;

public abstract class Intervenant {

    private int id;
    private String prenom;
    private String nom;
    private Categorie laCategorie;
    private ArrayList<Projet> projetsResponsable;
    private ArrayList<Affectation> lesAffectations;

    public Intervenant() {
    }

    public Intervenant(int id, String prenom, String nom, Categorie laCategorie) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.laCategorie = laCategorie;
        this.projetsResponsable = new ArrayList<>();
        this.lesAffectations = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addIntervenant(Projet p) {
        if (projetsResponsable == null) {
            projetsResponsable = new ArrayList<>();
        }
        projetsResponsable.add(p);
    }

    public void addIntervenant(Affectation a) {
        if (lesAffectations == null) {
            lesAffectations = new ArrayList<>();
        }
        lesAffectations.add(a);
    }

    public abstract double calculCoutProjet(int nbJours);
}
