package main.java.org.example.oop_exercise.ex_1;

public class BankAccount {
    int accountNumber;
    double balance;
    String owner;

    void depositing(double amount) {
        balance += amount;
    }
}
