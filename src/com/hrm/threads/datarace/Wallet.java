package com.hrm.threads.datarace;

public class Wallet {
    private int balance;
    
    public void topUp(int amount) {
        synchronized (this) {
            balance += amount;
        }
    }
    
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new RuntimeException("Account balance is insufficient");
        }
        balance -= amount;
    }
    
    public int getBalance() {
        return balance;
    }
}
