package com.hrm.threads.block;

public class BlockDemo {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                wallet.changeBalance(100);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                wallet.changeBalance(-100);
            }
        });
        t2.start();
        t1.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Actual balance: " + wallet.getBalance());
    }
}
