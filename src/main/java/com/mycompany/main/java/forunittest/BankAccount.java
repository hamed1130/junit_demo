package com.mycompany.main.java.forunittest;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive = true;
    private String holderName;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() { return balance; }
    public double getMinimumBalance() { return minimumBalance; }
    public boolean isActive() { return isActive; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }


    public double withdraw(double amount) {
        if (balance - minimumBalance >= amount) {
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }

    public double deposit(double amount) {
        return balance += amount;
    }
}
