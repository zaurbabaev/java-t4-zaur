package az.edu.itbrains.atm3.services;

import az.edu.itbrains.atm3.models.Account;

import java.util.Map;

public interface ATMService {

    public void addAccount(Account account, Map<Integer,Account> accounts);


    public void displayMenu();

    public void run(Map<Integer,Account> accounts);
}
