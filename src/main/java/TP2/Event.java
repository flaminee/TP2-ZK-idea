package TP2;

public class Event {

    String name;
    String date;
    String hall;
    String place;

    public Event(String name, String date, String hall, String place) {
        this.name = name;
        this.date = date;
        this.hall = hall;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String nom) {
        this.name = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String salle) {
        this.hall = salle;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String ville) {
        this.place = ville;
    }
}
