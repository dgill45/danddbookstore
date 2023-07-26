import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> items = new ArrayList<>();
    private double total = 0;
    private double taxRate = .10;

    public Cart(){

    }

    public Cart(ArrayList<Product> items, double total, double taxRate){
        this.items = items;
        this.total = total;
        this.taxRate = taxRate;
    }
    public ArrayList<Product> getItems(){
        return items;
    }
    public void addItem(Product p){
        items.add(p);
        total += p.getPrice();
    }
}
