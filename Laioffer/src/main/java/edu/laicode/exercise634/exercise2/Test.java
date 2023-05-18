package edu.laicode.exercise634.exercise2;

import java.util.Queue;
import java.util.ArrayDeque;

public class Test {

	private Queue<Integer> queue;


	public Test(){
		queue=new ArrayDeque<>();
	}

	public void push(int x){
		queue.offer(x);
	}

	public boolean isEmpty(){
		return queue.isEmpty();
	}

	public Integer top(){
		if(queue.isEmpty()){
			return null;
		}

		int result=pop();
		queue.offer(result);
		return result;
	}

	public Integer pop(){
		if(queue.isEmpty()){
			return null;
		}

		int size=queue.size();
		while(--size!=0){
			queue.offer(queue.poll());
		}

		return queue.poll();
	}
}
