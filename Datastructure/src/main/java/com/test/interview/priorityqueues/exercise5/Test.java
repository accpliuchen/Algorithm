package com.test.interview.priorityqueues.exercise5;

import java.util.PriorityQueue;

class Demo implements Comparable<Demo> {
    private int value;

    Demo(int value) {
        this.value = value;
    }

    public int getValue(){
    	return this.value;
    }

    @Override
    public int compareTo(Demo demo) {
        if(this.value==demo.value){
        	return 0;
        }
        return this.value<demo.value?1:-1;
    }
}

public class Test {

	public static void main(String args[]){
		PriorityQueue<Demo> minHeap=new PriorityQueue<Demo>();

		minHeap.offer(new Demo(5));
	   	minHeap.offer(new Demo(4));
	   	minHeap.offer(new Demo(2));
	   	minHeap.offer(new Demo(3));
	   	minHeap.offer(new Demo(1));

	   	while(!minHeap.isEmpty()){
	   		System.out.println(minHeap.poll().getValue());
	   	}	
	}
}
