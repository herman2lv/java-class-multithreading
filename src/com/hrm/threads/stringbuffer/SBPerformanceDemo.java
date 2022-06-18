package com.hrm.threads.stringbuffer;

public class SBPerformanceDemo {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 30_000_000; i++) {
            sb.append(i);
        }
        System.out.println(System.currentTimeMillis() - time);
    }

}
