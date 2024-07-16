package az.edu.itbrains.atm3.services;

import az.edu.itbrains.atm3.models.Account;

public interface AccountService {

    void deposit(double amount, Account account);

    void withdraw(double amount,Account account);
}
