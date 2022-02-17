package TP2;

import data.BudgetLine;
import org.zkoss.json.JSONArray;
import org.zkoss.json.JSONObject;
import org.zkoss.json.parser.JSONParser;

import javax.swing.table.AbstractTableModel;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.*;

public class ArtistTableModel extends AbstractTableModel {


    private List<Artist> artistData = new ArrayList<Artist>();

    private String[] columnNames =  {"Artiste", "Pays", "Ville", "Année"};

    public ArtistTableModel() {
        artistData = new ArrayList<>();

        JSONParser parser = new JSONParser();

        try{
            Object obj = parser.parse(new FileReader("C:\\Users\\Flamine\\Documents\\out.json"));
            JSONArray jsonArray = (JSONArray) obj;

            for(Object object : jsonArray){

                JSONObject jsonObject = (JSONObject) object;
                JSONObject field = (JSONObject) jsonObject.get("fields");

                ArrayList<Event> events = new ArrayList<>();

                //Artist data
                String annee = "";
                String pays = "";
                String ville = "";
                String name = "";
                String edition = "";

                //Event data
                String eventName = "";
                String date = "";
                String eventCity = "";
                String salle = "";


                if(field.containsKey("annee")){
                    annee =  field.get("annee").toString();
                }
                if(field.containsKey("origine_pays1")){
                    pays =  field.get("origine_pays1").toString();
                }
                if(field.containsKey("origine_ville1")){
                    ville =  field.get("origine_ville1").toString();
                }
                if(field.containsKey("artistes")){
                    name =  field.get("artistes").toString();
                }
                if(field.containsKey("edition")){
                    edition =  field.get("edition").toString();
                }

                for(int i = 1; i < 7 ; i++){

                    String order;
                    if(i == 1 ){ order = "er_projet_atm"; }
                    else {order = "eme_projet"; }

                    if(field.containsKey( i + order)){
                        eventName = field.get(i+order).toString();
                    }else{
                        eventName = "";
                    }

                    if(i == 1 ){ order = "ere_date"; }
                    else {order = "eme_date"; }

                    if(field.containsKey( i + order)){
                        date = field.get(i+order).toString();
                    } else{
                        date = "";
                    }

                    if(i == 1 ){ order = "ere_ville"; }
                    else {order = "eme_ville"; }


                    if(field.containsKey( i + order)){
                        eventCity = field.get(i+order).toString();
                    }else{
                        eventCity = "";
                    }

                    if(i == 1 ){ order = "ere_salle"; }
                    else {order = "eme_salle"; }

                    if(field.containsKey( i + order)){
                        salle = field.get(i+order).toString();
                    }else{
                        salle = "";
                    }
                    if(!eventName.equals("") || !date.equals("") || !salle.equals("") || !eventCity.equals("")){
                        events.add(new Event(eventName, date, salle, eventCity));
                    }

                }

                artistData.add(new Artist(name, pays, ville, annee, edition, events));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }

    public ArtistTableModel(List<Artist> artistData) {
        this.artistData = artistData;
    }

    public List<Artist> getArtists() {
        return artistData;
    }

    public void setArtists(List<Artist> artists) {
        this.artistData = artists;
    }


    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return artistData.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object artistAttribut = null;
        Artist artist = artistData.get(rowIndex);
        switch (columnIndex){
            case 0 : artistAttribut = artist.getNom(); break;
            case 1 : artistAttribut = artist.getPays(); break;
            case 2 : artistAttribut = artist.getVille(); break;
            case 3 : artistAttribut = artist.getAnnee(); break;
            default: break;

        }
        return  artistAttribut;
    }

    public List<Artist> getFilter(ArtistFilter artistFilter) {
        List<Artist> someArtists = new ArrayList<Artist>();

        String nom = artistFilter.getNom().toLowerCase();
        String pays = artistFilter.getPays().toLowerCase();
        String ville = artistFilter.getVille().toLowerCase();
        String annee = artistFilter.getAnnee().toLowerCase();
        String edition = artistFilter.getEdition().toLowerCase();

        for(Iterator<Artist> i = this.artistData.iterator(); i.hasNext();){
            Artist tmp = i.next();
            if((tmp.getAnnee().toLowerCase().contains(annee)) &&
            (tmp.getNom().toLowerCase().contains(nom)) &&
            (tmp.getEdition().toLowerCase().contains(edition)) &&
            (tmp.getPays().toLowerCase().contains(pays)) &&
            (tmp.getVille().toLowerCase().contains(ville))){
                someArtists.add(tmp);
            }
        }

        return someArtists;

    }
}
