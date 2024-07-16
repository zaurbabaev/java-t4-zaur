//package az.edu.itbrains.atm;
//
//import az.edu.itbrains.atm.model.Bank;
//import az.edu.itbrains.atm.model.Customer;
//
//import java.util.Date;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Bank bank = new Bank();
//        Customer customer;
//        int choice;
//        while (true) {
//            System.out.println("\n-----------------");
//            System.out.println("Bank    of      Java");
//            System.out.println("-----------------\n");
//            System.out.println("1. Registrar cont.");
//            System.out.println("2. Login.");
//            System.out.println("3. Exit.");
//            System.out.print("\nEnter your choice : ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 1 -> {
//                    System.out.print("Enter First Name : ");
//                    String firstName = scanner.nextLine();
//
//                    System.out.print("Enter Last Name : ");
//                    String lastName = scanner.nextLine();
//
//                    System.out.print("Enter Address : ");
//                    String address = scanner.nextLine();
//
//                    System.out.print("Enter contact number : ");
//                    String phone = scanner.nextLine();
//
//                    System.out.print("Set username : ");
//                    String username = scanner.nextLine();
//
//                    while (bank.customerMap.containsKey(username)) {
//                        System.out.println("Username already exists. Set again : ");
//                        username = scanner.nextLine();
//                    }
//                    System.out.println("Set a password:");
//                    String password = scanner.nextLine();
//                    scanner.nextLine();
//
//                    customer = new Customer(firstName, lastName, address, phone, username, password, customer.getBalance(), );
//                }
//            }
//
//        }
//    }
//}
