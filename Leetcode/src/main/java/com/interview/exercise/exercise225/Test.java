package com.interview.exercise.exercise225;

import java.util.Queue;
import java.util.ArrayDeque;

public class Test {

	Queue<Integer> inputQueue;
    Queue<Integer> outputQueue;

    public Test() {
        inputQueue=new ArrayDeque<>();
        outputQueue=new ArrayDeque<>();    
    }
    
    public void push(int x) {
        inputQueue.offer(x);
    }
    
    public int pop() {
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
    
    
    public int top() {
        Integer result=new Integer(pop());

        if(result!=null){
            inputQueue.offer(result);
        }

        return result;
    }
    
    public boolean empty() {
        return inputQueue.isEmpty();
    }

	  public static void main(String args[]){
	  	Test myStack = new Test();
		myStack.push(1);
		myStack.push(2);
		myStack.top(); // return 2
		myStack.pop(); // return 2
		myStack.empty(); // return False
	  }
}
