package com.hrm.threads.locks;

public class LongReaderDemo {
    public static void main(String[] args) {
        LongReader resource = new LongReader();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                resource.doSomeReading();
            });
            thread.start();
        }
    }

}
