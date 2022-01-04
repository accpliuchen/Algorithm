package com.test.interview.stack.minStack;

import java.util.Stack;

class MinStack{

    private Stack<Integer> minStack;
    private Stack<Integer> dataStack;

    public MinStack(){
        minStack=new Stack<>();
        dataStack=new Stack<>();
    }

    public void push(int newNum){
        if(minStack.isEmpty()){
            minStack.push(newNum);
        }else if(newNum<= getMin()){
            minStack.push(newNum);
        }
        dataStack.push(newNum);
    }

    public int pop(){
       if(dataStack.isEmpty()){
           throw new RuntimeException("You stack is empty");
       }

       int value=dataStack.pop();
       if(value==this.getMin()){
           minStack.pop();
       }

       return value;
    }

    public int getMin(){
        if(minStack.isEmpty()){
            throw new RuntimeException("You Stack is empty");
        }
        return minStack.peek();
    }

}

public class Test {


    public static void main(String args[]){

    }
}
