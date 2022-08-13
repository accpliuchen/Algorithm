package edu.laicode.exercise634;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack{
	Queue<Integer> inputQueue;
	Queue<Integer> outputQueue;
	int top;

	public MyStack(){
		inputQueue=new ArrayDeque<>();
		outputQueue=new ArrayDeque<>();
	}

	public void push(int x){
		inputQueue.add(x);
		top=x;
	}

	public int pop(){
		while(inputQueue.size()>1){
			top=inputQueue.poll();
			outputQueue.add(top);
		}
		Queue<Integer> temp=inputQueue;
		inputQueue=outputQueue;
		outputQueue=temp;

		return outputQueue.poll();
	}

	public int top(){
		return top;
	}

	public boolean empty(){
		return inputQueue.isEmpty();
	}

}

public class Test {

	public static void main(String args[]){
            MyStack myStack=new MyStack();
            myStack.push(1);
			myStack.push(2);
			myStack.top(); // return 2
			myStack.pop(); // return 2
			myStack.empty(); // return False

	}
}
