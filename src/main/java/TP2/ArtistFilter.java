package TP2;

public class ArtistFilter {


        private String name = "";
        private String country = "";
        private String city = "";
        private String year = "";
        private String edition = "";


        public String getEdition() {
            return edition;
        }

        public void setEdition(String edition) {
            this.edition = edition==null?"":edition.trim();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name==null?"":name.trim();
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country==null?"":country.trim();
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city==null?"":city.trim();
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year==null?"":year.trim();
        }

}
