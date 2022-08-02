package com.hrm.threads.stringbuffer;

public class SBThreadsDemo {
    
    private final static String longStringA = "Kandiboberization!\n";
    private final static String longStringX = "BBBBBBBBBBBBBBBBBB\n";
    
    public static void main(String[] args) throws InterruptedException {
        StringBuilder builder = new StringBuilder();
//        StringBuffer builder = new StringBuffer();
        Thread th1 = new Thread(() -> perform(builder, longStringA));
        Thread th2 = new Thread(() -> perform(builder, longStringX));
        
        th2.start();
        th1.start();
        
        th1.join();
        th2.join();
        
        System.out.println(builder.toString());
    }
    
    private static void perform(StringBuilder builder, String charsToAppend) {
//    private static void perform(StringBuffer builder, String charsToAppend) {
        for (int i = 0; i < 100; i++) {
            builder.append(charsToAppend);
        }
    }

}
