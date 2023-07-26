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
    public void showDetails(){
        System.out.println("--Cart--");
        for (Product item : items){
            String itemsInCartByName = item.getName();
            double itemsInCartByPrice = item.getPrice();
            int itemCountInCart = items.size();
            String formatString = (String.format("Item Count: %d%nItems:%n%s: $%.2f", itemCountInCart, itemsInCartByName, itemsInCartByPrice));
            System.out.println(formatString);
        }
        double postTaxTotal = total + (total * taxRate);
        String formatString2 = String.format("Pre-Tax Total: $%.2f%nPost-Tax Total (10.00%% Tax): $%.2f", total, postTaxTotal);
        System.out.println();
        System.out.println(formatString2);
    }
}
