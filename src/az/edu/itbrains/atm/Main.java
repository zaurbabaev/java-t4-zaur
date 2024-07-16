//package az.edu.itbrains.atm;
//
//import az.edu.itbrains.atm3.models.ATM;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ATM atm = new ATM();
//        while (true){
//            System.out.println("Welcome to the ATM!");
//            System.out.println("1. Check balance");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Deposit");
//            System.out.println("4. Exit");
//            System.out.println("Enter your choice:");
//            int choice = scanner.nextInt();
//            switch (choice){
//                case 1->atm.checkBalance();
//                case 2->atm.withdraw();
//                case 3 -> atm.deposit();
//                case 4-> {
//                    System.out.println("Thank you for using out ATM! Have a nice day");
//                    System.exit(0);
//                }
//                default -> System.out.println("Invalid choice! Please try again");
//            }
//
//        }
//    }
//}
