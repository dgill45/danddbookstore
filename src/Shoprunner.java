import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;





public class Shoprunner {


    public static void main( String[] args) {

        Product[] products = new Product[]{
                new Product("The Knights of Malkillian", 49.99),
                new Product("Children of Notgnivri", 24.99),
                new Product("Stones of the Three Sisters", 49.99),
                new Product("Tales from the Vale", 34.99),
                new Product("The Three Elven Towers", 49.99)
        };
        Shop shop = new Shop(products);
        Menu menu = new Menu(shop, new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8)));

        menu.greet();
        menu.executeMenu();
    }

}
