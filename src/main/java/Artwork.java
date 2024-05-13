public class Artwork {

    // properties
    private String title;
    private Artist artist;  // String??
    private double price;

    public Artwork(String title, double price, String artistName){
        this.title = title;
        this.price = price;
        this.artist = new Artist(artistName);
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public String getArtistName(){
        return this.artist.getName();
    }
}
