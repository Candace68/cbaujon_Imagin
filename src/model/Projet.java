package model;

import java.util.ArrayList;

public class Projet {

    private int id;
    private String nom;
    private int nbJoursHPrevu;
    private int budgetPrevu;
    private Intervenant lIntervenant;
    private ArrayList<Affectation> affectations;

    public Projet(int id, String nom, int nbJoursHPrevu, int budgetPrevu, Intervenant lIntervenant) {
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

    public int getBudgetPrevu() {
        return budgetPrevu;
    }
    public void setBudgetPrevu(int budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }

    public int getLIntervenant() {
        return lIntervenant;
    }
    public void setLIntervenant(int lIntervenant) {
        this.lIntervenant = lIntervenant;
    }

    public void addprojet(Affectation a) {
        if (affectations == null) {
            affectations = new ArrayList<>();
        }
        affectations.add(a);
    }
}
