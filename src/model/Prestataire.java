package model;

public class Prestataire extends Intervenant {

    private double forfait;
    private double coutJournalier;
    private Societe societe;

    public Prestataire() {
        super();
    }

    public Prestataire(int id, String prenom, String nom, Categorie laCategorie, double forfait, double coutJournalier, Societe societe) {
        super(id, prenom, nom, laCategorie);
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
        this.societe = societe;
    }

    public double getForfait() {return forfait;}
    public void setForfait(double forfait) {this.forfait = forfait;}

    public double getCoutJournalier() {return coutJournalier;}
    public void setCoutJournalier(double coutJournalier) {this.coutJournalier = coutJournalier;}

    public Societe getSociete() {return societe;}
    public void setSociete(Societe societe) {this.societe = societe;}
}