package com.hrm.threads.racecondition;

import java.util.concurrent.CountDownLatch;

import com.hrm.threads.ThreadUtil;

public class OutputThread extends Thread {
    private final CountDownLatch barrier;
    
    public OutputThread(CountDownLatch barrier) {
        this.barrier = barrier;
    }


    @Override
    public void run() {
        System.out.println("[OUTPUT] Try to do some stuff...");
        ThreadUtil.sleep(100);
        System.out.println("[OUTPUT] Try to do some more stuff...");
        ThreadUtil.sleep(100);
        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String account = RaceConditionDemo.accountNumber;
        System.out.println("[OUTPUT] Has read account number");
        System.out.println("[OUTPUT] The account is: " + account);
        ThreadUtil.sleep(100);
        System.out.println("[OUTPUT] Do some stuff with the account");
        System.out.println("[OUTPUT] Finish");
    }

}
