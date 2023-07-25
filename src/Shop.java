public class Shop {
    private Product[] products;

    public Shop(){

    }
    public Shop(Product[] products){
        this.products = products.clone();
    }

    public void printProducts() {
        System.out.println("--Products__");
        for (int i = 0; i < products.length; i++) {
            System.out.println("ID" + i + ": " + products[i].getName() + " -$" + products[i].getPrice());
        }
    }

    public int findProduct(String searchText) {
        for (int i = 0; i < products.length; i++) {
            if (searchText.equals(products[i].getName())) {
                return i;
            }
        }
        return -1;
    }
}