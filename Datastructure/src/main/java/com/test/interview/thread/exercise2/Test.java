package com.test.interview.thread.exercise2;

public class Test {

	public static void main(String args[]) throws InterruptedException{
		Thread t=new Thread(()->{
			System.out.println("hello");
		});

		System.out.println("start");
		t.start();
		t.join();

		System.out.println("end");
	}
}
