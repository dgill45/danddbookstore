import java.util.ArrayList;
public class Shop {
    private String name;
    private ArrayList<Product> products;

    public Shop(){

    }
    public Shop(String name, ArrayList<Product> products){
        this.name = name;
        this.products = products;
    }

    public void printProducts() {
        System.out.println("--Products__");
        for (Product product : products) {
            System.out.println("ID" + product.getId() + ": " + product.getName() + " - $" + product.getPrice());
        }
    }

    public int findProduct(String searchText) {
        for (Product product : products) {
            if (searchText.equals(product.getName())) {
                return product.getId();
            }
        }
        return -1;
    }
    public Product getProductById(int id){
        for (Product product : products){
            if (id == product.getId()){
                return product;
            }
        }
        return null;

    }
}