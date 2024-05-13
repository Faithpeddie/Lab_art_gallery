import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0.00;
        this.stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public double getTillBalance(){
        return this.till;
    }

    public void depositToTill(double amount){
        this.till += amount;
    }

    public Artwork getArtworkFromStock(int index){
       return this.stock.get(index);
    }

    public int getSizeOfStock(){
        return this.stock.size();
    }

    public void addArtworkToStock(Artwork artwork){
        this.stock.add(artwork);
    }

    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

    public double stock_take(){
        double total = 0;
        for(Artwork artwork: stock){
            total += artwork.getPrice();
        }
        return total;
    }

}
