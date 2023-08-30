package com.test.interview.thread.exercise4;

public class Test {

	public static void main(String args[]) throws InterruptedException{

		Thread thread2=new Thread(new Runnable(){
		@Override
		 public void run(){
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		});

		System.out.println("Before current Thread State "+ Thread.currentThread().getState().toString());
        System.out.println("Thread executed");

        System.out.println("no call start method, Thread State "+ thread2.getState().toString());
        thread2.start();
		System.out.println("call start method, Thread State "+ thread2.getState().toString());

		Thread.sleep(200L);
		System.out.println("after 200 second, Thread State "+ thread2.getState().toString());


		Thread.sleep(3000L);
		System.out.println("after 3000 second, Thread State "+ thread2.getState().toString());

	}
}
