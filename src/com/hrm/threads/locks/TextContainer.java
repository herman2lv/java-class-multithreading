package com.hrm.threads.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TextContainer {
    private char[] content = new char[100];
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    
    public String read() {
        lock.readLock().lock();
        String out = "";
        for (int i = 0; i < content.length; i++) {
            out += content[i];
        }
        lock.readLock().unlock();
        return out;
    }
    
    public void modify(char ch) {
        lock.writeLock().lock();
        for (int i = 0; i < content.length; i++) {
            content[i] = ch;
        }
        lock.writeLock().unlock();
    }
}
