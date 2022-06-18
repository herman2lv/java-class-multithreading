package com.hrm.threads.datarace;

public class DataRaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Wallet wallet = new Wallet();
        System.out.println("Inital account balance is " + wallet.getBalance());
        Thread user2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                wallet.topUp(1);
            }
        });
        Thread user1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                wallet.topUp(1);
            }
        });
        
        user1.start();
        user2.start();
        
        user1.join();
        user2.join();
        
        
        System.out.println("Actual account balance is " + wallet.getBalance());
        
    }
    
    

}
