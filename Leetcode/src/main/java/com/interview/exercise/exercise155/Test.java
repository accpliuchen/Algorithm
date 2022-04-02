package com.interview.exercise.exercise155;

import java.util.Stack;

class MinStack{

    Stack<Integer> minStack;
    Stack<Integer> dataStack;

    public MinStack(){
        minStack=new Stack<Integer>();
        dataStack=new Stack<Integer>();
    }

    public void push(int val){
        dataStack.push(val);

        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            if(val>minStack.peek()){
                val=minStack.peek();
            }
            minStack.push(val);
        }
    }

    public int getMin(){
        return minStack.peek();
    }

    public void pop(){
        minStack.pop();
        dataStack.pop();
    }

    public int top(){
        return dataStack.peek();
    }


}

public class Test {

    public static void main(String args[]){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        //minStack.top();    // return 0

        System.out.println(minStack.top());
        minStack.getMin(); // return -2
    }
}
