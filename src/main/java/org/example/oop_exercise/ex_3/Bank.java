package main.java.org.example.oop_exercise.ex_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account added. Account number: " + account.getAccountNumber());
    }

    public BankAccount getAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        BankAccount fromAccount = getAccount(fromAccountNumber);
        BankAccount toAccount = getAccount(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer of $" + amount + " from account " + fromAccountNumber +
                    " to account " + toAccountNumber + " successful.");
        } else {
            System.out.println("Invalid account numbers for transfer.");
        }
    }
}
