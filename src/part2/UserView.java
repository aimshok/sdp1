package part2;

import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getUserName() {
        System.out.print("Enter user name: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void displayUsers(String[] users) {
        System.out.println("User List:");
        for (String user : users) {
            System.out.println("- " + user);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void closeScanner() {
        scanner.close();
    }
}