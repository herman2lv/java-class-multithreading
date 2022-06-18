package com.hrm.threads;


/**
 * Simple Utility class that could be used to call Thread.sleep(..) and
 * Thread.join(..) without error handling to help focus on work with threads
 * during demo session
 *
 */
public class ThreadUtil {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void join(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
