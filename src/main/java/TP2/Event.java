package TP2;

public class Event {

    String nom;
    String date;
    String salle;
    String ville;

    public Event(String nom, String date, String salle, String ville) {
        this.nom = nom;
        this.date = date;
        this.salle = salle;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
