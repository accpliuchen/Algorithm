package com.test.interview.queue.exercise4;

import java.util.Queue;
import java.util.ArrayDeque;

public class Test {

	public static void main(String args[]){
		Queue<Integer> queue=new ArrayDeque<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);

		while(!queue.isEmpty()){
			System.out.println(queue.peek()); //1 2 3
			System.out.println(queue.poll()); //1 2 3
		}
		System.out.println(queue.peek());
		System.out.println(queue.poll());
	}
}
