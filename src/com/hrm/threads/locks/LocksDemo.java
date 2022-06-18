package com.hrm.threads.locks;

public class LocksDemo {
    public static void main(String[] args) throws InterruptedException {
        TextContainer text = new TextContainer();
        text.modify('x');
        System.out.println(text.read());
        Thread reader1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(text.read());
            }
        });
        Thread reader2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(text.read());
            }
        });
        Thread writer1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                char ch = (char) ('0' + i);
                text.modify(ch);
                System.out.println("Modified with " + ch);
            }
        });
        Thread writer2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                char ch = (char) ('a' + i);
                text.modify(ch);
                System.out.println("Modified with " + ch);
            }
        });

        reader1.start();
        writer1.start();
        writer2.start();
        reader2.start();

        reader1.join();
        reader2.join();
        writer1.join();
        writer2.join();
        System.out.println("FINISH");
    }
}
