package main.java.org.example.oop_exercise.ex_3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1 = new BankAccount(1, 1000, "John Doe");
        BankAccount account2 = new BankAccount(2, 2000, "Jane Doe");

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.transfer(1, 2, 200);

        System.out.println("Balance of account 1: $" + account1.getBalance());
        System.out.println("Balance of account 2: $" + account2.getBalance());
    }
}
