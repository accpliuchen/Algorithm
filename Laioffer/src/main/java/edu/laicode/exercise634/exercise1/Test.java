package edu.laicode.exercise634.exercise1;

import java.util.Queue;
import java.util.ArrayDeque;


class MyStack{
	private Queue<Integer> inputQueue;
	private Queue<Integer> outputQueue;

	public MyStack(){
		inputQueue=new ArrayDeque<>();
		outputQueue=new ArrayDeque<>();
	}

	public void push(int x){
		inputQueue.offer(x);
	}

	public Integer pop(){
		Integer prev=inputQueue.poll();
        Integer cur=inputQueue.poll();

        while(cur!=null){
        	outputQueue.offer(prev);
        	prev=cur;
        	cur=inputQueue.poll();
        } 

        Queue<Integer> temp=inputQueue;
        inputQueue=outputQueue;
        outputQueue=temp;

        return prev;
      
	} 

	public Integer top(){
		Integer result=pop();

		if(result!=null){
			inputQueue.offer(result);
		}
		return result;
	}

	public boolean isEmpty(){
		return top()==null;
	}
}

public class Test {

	public static void main(String args[]){
        MyStack myStack=new MyStack();
        myStack.push(1);
		myStack.push(2);
		myStack.top(); // return 2
		myStack.pop(); // return 2
		myStack.isEmpty(); // return False

	}
}
