package TP2;

import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;

import java.util.ArrayList;

public class Artist {
    private String name;
    private String country;
    private String city;
    private String year;
    private String edition;
    private ArrayList<Event> events;

    public Artist(String name, String country, String city, String year, String edition, ArrayList<Event> event) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.year = year;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
