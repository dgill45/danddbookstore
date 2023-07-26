import java.util.Scanner;

public class Menu {
    private String[] menuOptions = {"Exit", "List Products", "Buy Product", "Find Product", "Show Cart", "Checkout"};
    private Scanner scanner;
    private Shop shop;
    private Cart cart;


    public Menu(Shop shop, Cart cart, Scanner scanner) {
        this.shop = shop;
        this.cart = cart;
        this.scanner = scanner;
    }

    public void executeMenu() {
        printMenu();
        int optedInt = getNextIntFromUser();

        while (optedInt != 0){

            if (optedInt == 1) {
                shop.printProducts();
                printMenu();
            }else if (optedInt == 3) {
                System.out.println("Enter the item to search for:");
                String userEnteredItem = getNextStringLineFromUser();
                int foundItem = shop.findProduct(userEnteredItem);
                if (foundItem != -1) {
                    System.out.println(userEnteredItem + " was found and its product id is " + foundItem);
                } else {
                    System.out.println("That product was not found");
                }
                printMenu();
            }
            optedInt = getNextIntFromUser();
        }
            exit();
    }



    public void greet() {
        String shopName = "5e Bookstore";
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
