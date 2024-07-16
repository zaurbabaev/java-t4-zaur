package az.edu.itbrains.atm2.services;

import javax.xml.crypto.Data;

public interface SavingAccount {
    void deposit(double amount, Data data);
}
