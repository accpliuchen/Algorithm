package com.test.interview.priorityqueues.exercise4;

import java.util.PriorityQueue;

public class Test {
	public static void main(String args[]){
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();

		minHeap.offer(5);
	   	minHeap.offer(4);
	   	minHeap.offer(2);
	   	minHeap.offer(3);
	   	minHeap.offer(1);

	   	while(!minHeap.isEmpty()){
	   		System.out.println(minHeap.poll());
	   	}	

	}
}
