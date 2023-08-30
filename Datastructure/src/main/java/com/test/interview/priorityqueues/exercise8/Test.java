package com.test.interview.priorityqueues.exercise8;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args){
//		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//		PriorityQueue pq=new PriorityQueue<>();

		PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1,o2);//e1<e2  ASC   minHeap
				//return Integer.compare(o2,o1); //e2>e1 DESC maxHeap
			}
		});

		pq.offer(-3);
		pq.offer(6);
		pq.offer(0);
		pq.offer(9);
        
		System.out.println(pq);

		int len=pq.size();

		for(int i=0;i<len;i++){
			System.out.println(pq.poll()+" ");
		}

		System.out.println();
	}
}
