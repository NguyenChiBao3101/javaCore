package oops.bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCard managerCard = new ManagerCard(); // Assuming ManagerCard class is already implemented
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Insert");
            System.out.println("2. show list card");
            System.out.println("3. Remove (input id)");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    // Insert sample data
                    managerCard.addCard();
                    System.out.println("Data inserted successfully!");
                }
                case 2 -> managerCard.showListCards();
                case 3 -> {
                    // Logic for removing
                    System.out.print("Enter ID to remove: ");
                    String removeId = scanner.nextLine();
                    boolean isRemoved = managerCard.deleteCard(removeId);
                    System.out.println("Remove successful: " + isRemoved);
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    return; // Exit the loop and program
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

