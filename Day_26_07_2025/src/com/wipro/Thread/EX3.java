package com.wipro.Thread;

public class EX3{
    int count = 0;

    public void increment() {
        count++;
    }
}

class WorkerThread extends Thread {
    Counter counter;

    public WorkerThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

