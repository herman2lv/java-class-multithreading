package com.hrm.threads.intro;

public class IntroDemo {

    public static void main(String[] args) {
        execute("MAIN");
    }

    private static void execute(String word) {
        for (int i = 0; i < 100; i++) {
            System.out.println("[" + word + "] " + i);
        }
    }

}
