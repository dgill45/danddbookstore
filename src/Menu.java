import java.util.Scanner;

public class Menu {
    private String[] menuOptions = {"Exit", "List Products", "Buy Product", "Find Product", "Show Cart", "Checkout"};
    private String[] products = {"The Knights of Malkillian", "Children of Notgnivri", "Stones of the Three Sisters", "Tales from the Vale", "The Three Elven Towers"};
    private Scanner scanner;


    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void executeMenu() {
        printMenu();
        int optedInt = getNextIntFromUser();

        if (optedInt == 1) {
            printProducts();
            printMenu();
        }else if (optedInt == 3){
            System.out.println("Enter the item to search for:");
            String userEnteredItem = getNextStringLineFromUser();
            int foundItem = findProduct(userEnteredItem);
            if (foundItem != -1) {
                System.out.println(userEnteredItem + " was found and its product id is " + foundItem);
            }else{
                System.out.println("That product was not found");
            }
            printMenu();
        }
            exit();
    }

    private void printProducts() {
        System.out.println("--Products__");
        for (int i = 0; i < products.length; i++) {
            System.out.println("ID" + i + ": " + products[i]);
        }
    }

    private int findProduct(String searchText) {
        for (int i = 0; i < products.length; i++) {
            if (searchText.equals(products[i])) {
                return i;
            }
        }
        return -1;
    }

    public void greet() {
        String shopName = "T-Shirt Mart";
        System.out.println("Hello. Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name + " to " + shopName );
    }

    private void printMenu() {
        System.out.println();
        System.out.println("--Main Menu--");
        System.out.println("Select an option using one of the numbers shown");
        System.out.println();

        for (int i = 0; i < menuOptions.length; i++) {
            System.out.print(i + ": ");
            System.out.println(menuOptions[i]);
        }
    }

    private void exit() {
        System.out.println("Exiting now. Goodbye.");
        scanner.close();
    }

    private int getNextIntFromUser() {
        return scanner.nextInt();
    }

    private String getNextStringLineFromUser() {
        scanner.nextLine();
        return scanner.nextLine();
    }
}
