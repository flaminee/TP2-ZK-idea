package TP2;

import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;

import java.util.ArrayList;

public class Artist {
    private String nom;
    private String pays;
    private String ville;
    private String annee;
    private String edition;
    private ArrayList<Event> events;

    public Artist(String nom, String pays, String ville, String annee, String edition, ArrayList<Event> event) {
        this.nom = nom;
        this.pays = pays;
        this.ville = ville;
        this.annee = annee;
        this.edition = edition;
        this.events = event;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
}
