package TP2;

public class ArtistFilter {


        private String nom = "";
        private String pays = "";
        private String ville = "";
        private String annee = "";
        private String edition = "";


        public String getEdition() {
            return edition;
        }

        public void setEdition(String edition) {
            this.edition = edition==null?"":edition.trim();
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom==null?"":nom.trim();
        }

        public String getPays() {
            return pays;
        }

        public void setPays(String pays) {
            this.pays = pays==null?"":pays.trim();
        }

        public String getVille() {
            return ville;
        }

        public void setVille(String ville) {
            this.ville = ville==null?"":ville.trim();
        }

        public String getAnnee() {
            return annee;
        }

        public void setAnnee(String annee) {
            this.annee = annee==null?"":annee.trim();
        }

}
