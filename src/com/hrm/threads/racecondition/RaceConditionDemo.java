package com.hrm.threads.racecondition;

import java.util.concurrent.CountDownLatch;

public class RaceConditionDemo {
    public static String accountNumber;
    
    public static void main(String[] args) {
        CountDownLatch barrier = new CountDownLatch(2);
        Thread inputTh = new InputThread(barrier);
        Thread outputTh = new OutputThread(barrier);
        inputTh.start();
        outputTh.start();
    }

}
