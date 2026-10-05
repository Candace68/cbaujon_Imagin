package model;

import java.time.LocalDate;

public class Salarie extends Intervenant {

    private LocalDate dtEmbauche;
    private int echelon;

    public Salarie() {
        super();
    }

    public Salarie(int id, String prenom, String nom, Categorie laCategorie, LocalDate dtEmbauche, int echelon) {
        super(id, prenom, nom, laCategorie);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public LocalDate getDtEmbauche() {return dtEmbauche;}
    public void setDtEmbauche(LocalDate dtEmbauche) {this.dtEmbauche = dtEmbauche;}

    public int getEchelon() {return echelon;}
    public void setEchelon(int echelon) {this.echelon = echelon;}
}
