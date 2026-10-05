package model;

public class Intervenant {

    private int id;
    private String prenom;
    private String nom;
    private Categorie laCategorie;

    public Intervenant() {
    }

    public Intervenant(int id,String prenom, String nom, Categorie laCategorie) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.laCategorie = laCategorie;
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

    public void setPrenom(String nom) {
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
