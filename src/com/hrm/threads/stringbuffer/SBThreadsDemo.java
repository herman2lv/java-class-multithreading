package com.hrm.threads.stringbuffer;

public class SBThreadsDemo {
    
    private final static String longStringA = "a".repeat(150) + '\n';
    private final static String longStringX = "X".repeat(150) + '\n';
    
    public static void main(String[] args) throws InterruptedException {
        StringBuilder notSafe = new StringBuilder();
//        StringBuffer safe = new StringBuffer();
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                notSafe.append(longStringA);
//                safe.append(longStringA);
            }
        });
        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                notSafe.append(longStringX);
//                safe.append(longStringX);
            }
        });
        
        th2.start();
        th1.start();
        
        th1.join();
        th2.join();
        
        System.out.println(notSafe.toString());
//        System.out.println(safe.toString());
    }

}
