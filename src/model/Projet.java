package model;

import java.util.ArrayList;

public class Projet {

    private int id;
    private String nom;
    private int nbJoursHPrevu;
    private double budgetPrevu;
    private Intervenant lIntervenant;
    private ArrayList<Affectation> affectations;

    public Projet(int id, String nom, int nbJoursHPrevu, double budgetPrevu, Intervenant lIntervenant) {
        this.id = id;
        this.nom = nom;
        this.nbJoursHPrevu = nbJoursHPrevu;
        this.budgetPrevu = budgetPrevu;
        this.lIntervenant = lIntervenant;
        this.affectations = new ArrayList<>();
    }

    public Projet() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getNbJoursHPrevu() {
        return nbJoursHPrevu;
    }
    public void setNbJoursHPrevu(int nbJoursHPrevu) {
        this.nbJoursHPrevu = nbJoursHPrevu;
    }

    public double getBudgetPrevu() {
        return budgetPrevu;
    }
    public void setBudgetPrevu(double budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }

    public Intervenant getlIntervenant() { return lIntervenant; }
    public void setlIntervenant(Intervenant lIntervenant) { this.lIntervenant = lIntervenant; }

    public void addprojet(Affectation a) {
        if (affectations == null) {
            affectations = new ArrayList<>();
        }
        affectations.add(a);
    }
}
