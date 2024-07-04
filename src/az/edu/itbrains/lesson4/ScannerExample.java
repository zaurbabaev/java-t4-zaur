package az.edu.itbrains.lesson4;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "Mark";
        String password = "12345";
        System.out.println("Enter your username");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter password");
        String inputPassword = scanner.nextLine();

        if (username.equalsIgnoreCase(inputUsername) && password.equalsIgnoreCase(inputPassword)) {
            System.out.println("Welcome " + username);
        } else {
            System.out.println("Username or password is not correct.");
        }
    }
}
