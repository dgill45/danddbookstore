import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;





public class Shoprunner {


    public static void main( String[] args) {

        String[] products = {"The Knights of Malkillian", "Children of Notgnivri", "Stones of the Three Sisters", "Tales from the Vale", "The Three Elven Towers"};
        Shop shop = new Shop(products);
        Menu menu = new Menu(shop, new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8)));

        menu.greet();
        menu.executeMenu();
    }

}
