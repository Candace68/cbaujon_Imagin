package model;

public class Projet {

    private int id;
    private String nom;
    private int nbJoursHPrevu;
    private int budgetPrevu;
    private Intervenant lIntervenant;

    public Projet(int id, String nom, int nbJoursHPrevu, int budgetPrevu, Intervenant lIntervenant) {
        this.id = id;
        this.nom = nom;
        this.nbJoursHPrevu = nbJoursHPrevu;
        this.budgetPrevu = budgetPrevu;
        this.lIntervenant = lIntervenant;
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
}
