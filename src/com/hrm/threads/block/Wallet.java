package com.hrm.threads.block;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Wallet {
    private int balance;
    private Lock lock = new ReentrantLock();

    public void changeBalance(int amount) {
        lock.lock();
        while (amount < 0 && Math.abs(amount) > balance) {
            try {
                System.out.println("Sleep");
                Thread.sleep(100);
                System.out.println("Awake");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance += amount;
        lock.unlock();
    }

    public int getBalance() {
        return balance;
    }
}
