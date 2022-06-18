package com.hrm.threads.state;

public class StateDemo {
    public static void main(String[] args) throws InterruptedException {
        Wallet wallet = new Wallet();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                wallet.topUp(100);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                wallet.withdraw(100);
            }
        });
        t2.start();
        t1.start();
        t1.join();
        t2.join();
    }
}
