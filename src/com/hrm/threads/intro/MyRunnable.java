package com.hrm.threads.intro;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\t\t[RUNNABLE] " + i);
        }        
    }

}
