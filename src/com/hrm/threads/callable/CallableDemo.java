package com.hrm.threads.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        Callable<Integer> callable = new MyCallable(2, 3);
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(callable);
        service.shutdown();
        System.out.println("Do some stuff...");
        try {
            System.out.println("The result is: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("FINISH");
    }
}
