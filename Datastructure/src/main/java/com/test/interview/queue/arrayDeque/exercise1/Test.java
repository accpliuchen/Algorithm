package com.test.interview.queue.arrayDeque.exercise1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
	public static void main(String args[]){
		
		Queue<Integer> queue=new ArrayDeque<Integer>();

        queue.add(2);
        queue.add(5);
        queue.add(6);

        //Current element at the top of the queue: 2
        System.out.println("Current element at the top of the queue : "+ queue.peek());

        //remove one integer fromthe queue
        System.out.println("Element removed from the queue: " + queue.poll());

        //Iterates through the queue
        System.out.print("Current elements in the queue: ");
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

	}
}
