package az.edu.itbrains.atm3.services.impls;

import az.edu.itbrains.atm3.models.Account;
import az.edu.itbrains.atm3.services.ATMService;

import java.util.Map;
import java.util.Scanner;

public class ATMServiceImpl implements ATMService {


    @Override
    public void addAccount(Account account, Map<Integer, Account> accounts) {
        accounts.put(account.getAccountNumber(), account);
    }

    @Override
    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    @Override
    public void run(Map<Integer, Account> accounts) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        AccountServiceImpl accountService = new AccountServiceImpl();
        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.printf("Current balance: $%.2f%n", account.getBalance());
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    accountService.deposit(depositAmount, account);
                    System.out.printf("Deposited: $%.2f%n", depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    accountService.withdraw(withdrawalAmount, account);
                    System.out.printf("Withdrew: $%.2f%n", withdrawalAmount);
                }
                case 4 -> {
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
