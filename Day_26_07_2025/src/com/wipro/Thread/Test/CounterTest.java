package com.wipro.Thread.Test;
import com.wipro.Thread.Counter;
import com.wipro.Thread.WorkerThread;
public class CounterTest{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        CounterThread t1 = new WorkerThread(counter);
        WorkerThread t2 = new WorkerThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (without sync): " + counter.count);
    }
}