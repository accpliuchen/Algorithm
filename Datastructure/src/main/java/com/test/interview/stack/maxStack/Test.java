package com.test.interview.stack.maxStack;

import java.util.Stack;

class MaxStack{
    private Stack<Integer> maxStack;
    private Stack<Integer> dataStack;

    public MaxStack(){
        maxStack=new Stack<>();
        dataStack=new Stack<>();
    }

    public void push(int newNum){
        if(maxStack.isEmpty()){
            maxStack.push(newNum);
        }else if(newNum>= getMax()){
            maxStack.push(newNum);
        }
        dataStack.push(newNum);
    }

    public int pop(){
        if(dataStack.isEmpty()){
            throw new RuntimeException("You stack is empty");
        }

        int value=dataStack.pop();
        if(value==this.getMax()){
            maxStack.pop();
        }

        return value;
    }

    public int getMax(){
        if(maxStack.isEmpty()){
            throw new RuntimeException("You Stack is empty");
        }
        return maxStack.peek();
    }
}

public class Test {
    public static void main(String args[]){
        MaxStack stack=new MaxStack();

        stack.push(5);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(6);

        int result=stack.getMax();

        System.out.println(result);
    }
}
