package az.edu.itbrains.atm3;

import az.edu.itbrains.atm3.models.ATM;
import az.edu.itbrains.atm3.models.Account;
import az.edu.itbrains.atm3.services.impls.ATMServiceImpl;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ATMServiceImpl atmService = new ATMServiceImpl();
        HashMap<Integer, Account> accountHashMap = new HashMap<>();


        atmService.addAccount(new Account(1001, "John Doe", 1000.00), accountHashMap);
        atmService.addAccount(new Account(1002, "Jane Doe", 1500.00), accountHashMap);
        atmService.run(accountHashMap);
    }
}
