package az.edu.itbrains.atm2.model;

import az.edu.itbrains.atm2.services.SavingAccount;

import javax.xml.crypto.Data;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person implements SavingAccount {

    private String username;

    private String password;

    private double balance;

    private ArrayList<String> transactions = new ArrayList<>(5);

    public Customer(String firstName, String lastName, String address, String phone,
                    String username, String password, double balance, ArrayList<String> transactions, Date date) {
        super(firstName, lastName, address, phone);
        this.username = username;
        this.password = password;
        this.balance = balance;
        addTransaction(String.format("Initial deposit - "+ NumberFormat.getCurrencyInstance().format(balance)+" as on "+"%1$tD"+" at "+"%1$tT.",date));
    }

    private void addTransaction(String message) {
        transactions.add(0, message);

        if (transactions.size() > 5) {
            transactions.remove(5);
            transactions.trimToSize();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    @Override
    public void deposit(double amount, Data date) {
        balance += amount;
        addTransaction(String.format(NumberFormat.getInstance().format(amount) + " credited to your account. Balance - " + NumberFormat.getInstance().format(balance)+" as on "+"%1$tD"+" at "+"%1$tT.",date));
    }


}
