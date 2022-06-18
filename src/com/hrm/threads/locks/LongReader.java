package com.hrm.threads.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.hrm.threads.ThreadUtil;

public class LongReader {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    
    public void doSomeReading() {
        lock.readLock().lock();
        ThreadUtil.sleep(100);
        System.out.println("Reading...");
        lock.readLock().unlock();
    }

}
