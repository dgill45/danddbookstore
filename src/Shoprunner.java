import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;





public class Shoprunner {


    public static void main( String[] args) {

        ArrayList<Product> products = new ArrayList<>();
                products.add(new Product(0, "The Knights of Malkillian", 49.99));
                products.add(new Product(1, "Children of Notgnivri", 24.99));
                products.add(new Product(2, "Stones of the Three Sisters", 49.99));
                products.add(new Product(3, "Tales from the Vale", 34.99));
                products.add(new Product(4, "The Three Elven Towers", 49.99));

        Shop shop = new Shop("5e Bookstore", products);
        Menu menu = new Menu(shop, new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8)));

        menu.greet();
        menu.executeMenu();
    }

}
