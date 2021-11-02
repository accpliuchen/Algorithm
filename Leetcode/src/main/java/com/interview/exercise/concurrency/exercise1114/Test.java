package com.interview.exercise.concurrency.exercise1114;

import java.util.concurrent.Semaphore;

public class Test {
    private Semaphore sem1;
    private Semaphore sem2;
    public Test() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        sem1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        sem1.acquire();
        printSecond.run();
        sem2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        sem2.acquire();
        printThird.run();
    }
}
