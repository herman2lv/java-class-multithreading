package com.hrm.threads.racecondition;

import java.util.concurrent.CountDownLatch;

import com.hrm.threads.ThreadUtil;

public class InputThread extends Thread {
    private final CountDownLatch barrier;
    
    public InputThread(CountDownLatch barrier) {
        this.barrier = barrier;
    }
    
    @Override
    public void run() {
        System.out.println("[INPUT] Try to read account number from DataBase...");
        ThreadUtil.sleep(100);
        String account = "AB032250";
        System.out.println("[INPUT] Has read account number from DataBase");
        ThreadUtil.sleep(100);
        RaceConditionDemo.accountNumber = account;
        barrier.countDown();
        System.out.println("[INPUT] Has set account number");
        ThreadUtil.sleep(100);
        System.out.println("[INPUT] Finish");
    }

}
