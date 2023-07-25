public class Shop {
    private String[] products;

    public Shop(){

    }
    public Shop(String[] products){
        this.products = products.clone();
    }

    public void printProducts() {
        System.out.println("--Products__");
        for (int i = 0; i < products.length; i++) {
            System.out.println("ID" + i + ": " + products[i]);
        }
    }

    public int findProduct(String searchText) {
        for (int i = 0; i < products.length; i++) {
            if (searchText.equals(products[i])) {
                return i;
            }
        }
        return -1;
    }
}