import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name){
        this.name = name;
        this.wallet = 0.00;
        this.artCollection = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public double getWalletAmount(){
        return this.wallet;
    }

    public void addToWallet(double amount){
        this.wallet += amount;
    }

    public void withdrawFromWallet(double amount){
        this.wallet -= amount;
    }

    public void addArtworkToArtCollection(Artwork artwork){
        this.artCollection.add(artwork);
    }

    public Artwork getArtworkFromArtCollection(int index){
        return this.artCollection.get(index);
    }

    public void buyArtwork(Gallery gallery, Artwork artwork){
        this.addArtworkToArtCollection(artwork);
        gallery.getStock().remove(artwork);

        double price = artwork.getPrice();
        this.withdrawFromWallet(price);
        gallery.depositToTill(price);
    }
}
