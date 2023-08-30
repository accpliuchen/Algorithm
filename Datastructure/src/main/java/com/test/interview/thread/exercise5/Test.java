package com.test.interview.thread.exercise5;


class Counter{

    private int count=0;

    public void add(int n) {
        synchronized (this) {
            count += n;
        }
    }

    public void dec(int n){
            synchronized (this){
            count-=n;
        }
    }

    public int get(){
    	return count;
    }

}
public class Test {

	public static void main(String args[]){

	}
}
