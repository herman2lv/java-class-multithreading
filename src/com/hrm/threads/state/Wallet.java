package com.hrm.threads.state;

public class Wallet {
    private int balance;
    
    public synchronized void topUp(int amount) {
        balance += amount;
        notifyAll();
    }
    
    public synchronized void withdraw(int amount) {
        while (amount > balance) {
            System.out.println("Start slleeping...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Check again");
        }
        balance -= amount;
    }
    
    public int getBalance() {
        return balance;
    }
}
