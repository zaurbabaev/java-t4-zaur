package az.edu.itbrains.atm3.services.impls;

import az.edu.itbrains.atm3.models.Account;
import az.edu.itbrains.atm3.services.AccountService;

public class AccountServiceImpl implements AccountService {

    @Override
    public void deposit(double amount, Account account) {
        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
    }

    @Override
    public void withdraw(double amount, Account account) {
        double currentBalance = account.getBalance();
        if (amount > currentBalance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            double newWithdrawBalance = currentBalance - amount;
            account.setBalance(newWithdrawBalance);
        }
    }
}
