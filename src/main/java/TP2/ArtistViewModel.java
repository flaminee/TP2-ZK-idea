package TP2;


import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;

import java.util.List;

public class ArtistViewModel {

    private ArtistTableModel artists;
    private ArtistFilter artistFilter = new ArtistFilter();
    private List<Artist> currentArtists;
    private Artist selectedArtist;

    private String title = "Le tableau d'artiste";
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public ArtistViewModel() {
        artists = new ArtistTableModel();
        currentArtists = artists.getArtists();
        selectedArtist = artists.getArtists().get(0);
    }

    public ListModel<Artist> getListModel() {
        return new ListModelList<Artist>(this.currentArtists);
    }


    public ArtistFilter getArtistFilter() {
        return artistFilter;
    }

    public Artist getSelectedArtist() {
        return selectedArtist;
    }

    @Command
    @NotifyChange({"listModel"})
    public void changeFilter() {
        currentArtists = this.artists.getFilter(artistFilter);
    }

    @Command
    @NotifyChange({"selectedArtist"})
    public void setSelectedArtist(@BindingParam("artist") Artist artist) {
        selectedArtist = artist;
    }
}
