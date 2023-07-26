import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;





public class Shoprunner {


    public static void main( String[] args) {

        ArrayList<Product> products = new ArrayList<>();
                products.add(new Product(0, "The Knights of Malkillian", 49.99, "Prevent the rise of a warlord returned from the dead to wreak havoc on the kingdom of Storm's Reach."));
                products.add(new Product(1, "Children of Notgnivri", 24.99, "Investigate the horrible disappearances of a coastal towns children."));
                products.add(new Product(2, "Stones of the Three Sisters", 49.99, "The City of Three Sisters was blessed by three goddesses after years of hard won independence and charity. Recover the stones stolen from the city and return it to its glory."));
                products.add(new Product(3, "Tales from the Vale", 34.99, "A collection of short adventures in the wilderness of Arrynvale."));
                products.add(new Product(4, "The Three Elven Towers", 49.99, "Journey to a land of ancient elven magic and mayhem in three rival cities to stop the recovery of an ancient weapon . . . and an ancient evil."));

        Shop shop = new Shop("5e Bookstore", products);
        Cart cart = new Cart();
        Menu menu = new Menu(shop, cart, new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8)));

        menu.greet();
        menu.executeMenu();
    }

}
