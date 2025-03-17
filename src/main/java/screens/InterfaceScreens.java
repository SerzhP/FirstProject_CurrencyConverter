
package screens;

import java.util.Scanner;
import java.util.List;


//Class to manage user interaction screens.

public class InterfaceScreens {
    private final Scanner scanner = new Scanner(System.in);

    public void welcome() {
        System.out.println("Welcome to currency converter!");
    }

    public int chooseOptions() {
        System.out.println("Please choose an option (1/2):");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");

        while (true) {
            try {
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2) {
                    return choice;
                } else {
                    System.out.println("Invalid choice, please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter 1 or 2.");
            }
        }
    }

    public double amountToConvert() {
        System.out.println("Please enter an amount to convert:");
        while (true) {
            try {
                System.out.print("Enter amount: ");
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
    }

    public boolean askToRestart() {
        System.out.println("Would you like to start over? (Y/N):");
        String choice = scanner.nextLine().trim().toLowerCase();
        return choice.equals("y");
    }

    public void endScreen(List<String> resultsList) {
        System.out.println("Thanks for using our currency converter!");
        System.out.println("Conversion results:");
        resultsList.forEach(System.out::println);
    }
}
