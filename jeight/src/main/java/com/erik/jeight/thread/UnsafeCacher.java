package com.erik.jeight.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class UnsafeCacher {
    private AtomicReference<Integer> side;

    private AtomicReference<Integer> area;

    public UnsafeCacher(int side) {
        this.side = new AtomicReference<>(side);
        this.area = new AtomicReference<>(side*side);
    }

    public synchronized void setSide(int side) {
        this.side.set(side);
        this.area.set(side*side);
    }

    public int getSide() {
        return this.side.get();
    }

    public int getArea() {
        return this.area.get();
    }

    public static void main(String args[]) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        UnsafeCacher unsafe = new UnsafeCacher(1);
        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> unsafe.setSide(unsafe.getSide()+1));
            executor.submit(() -> System.out.println(unsafe.getArea()));
        }
    }

}