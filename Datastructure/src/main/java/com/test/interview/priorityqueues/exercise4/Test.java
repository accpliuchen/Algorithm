package com.test.interview.priorityqueues.exercise4;

import java.util.PriorityQueue;
import java.util.Collections;

public class Test {
	public static void main(String args[]){
		// PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(Collections.reverseOrder());

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
