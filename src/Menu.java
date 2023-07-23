import java.util.Scanner;

public class Menu {
    private String[] menuOptions = {"Exit", "List Products", "Buy Product", "Find Product", "Show Cart", "Checkout"};
    private Scanner scanner;


    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void executeMenu() {
        printMenu();
        int optedInt = getNextIntFromUser();

        if (optedInt == 0) {
            exit();
        } else {
            System.out.println("Option " + optedInt + " was selected. Not yet implemented.");
        }

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
