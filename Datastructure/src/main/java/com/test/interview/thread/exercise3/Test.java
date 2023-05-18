package com.test.interview.thread.exercise3;

public class Test {

	public static void main(String args[]){
		// Thread  new run and terminated

		try{
			Thread thread1=new Thread(new Runnable(){

				@Override
				public void run(){
					System.out.println("Current Thread State "+ Thread.currentThread().getState().toString());
					System.out.println("Thread executed");
				}
			});

			System.out.println("Before current Thread State "+ thread1.getState().toString());
			thread1.start();
			Thread.sleep(2000L);
			System.out.println("After 2 seconds Thread State "+ thread1.getState().toString());

		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
}
