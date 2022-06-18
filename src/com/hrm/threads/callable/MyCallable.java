package com.hrm.threads.callable;

import java.util.concurrent.Callable;

import com.hrm.threads.ThreadUtil;

public class MyCallable implements Callable<Integer> {
    private int a;
    private int b;

    public MyCallable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("CALLED");
        int result = a + b;
        ThreadUtil.sleep(5000);
        System.out.println("COMPUTED");
        return result;
    }

}
