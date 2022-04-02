package com.interview.exercise.exercise716;

import java.util.Stack;

//https://blog.csdn.net/dongbeier/article/details/80275976
class MaxStack{
    Stack<Integer> dataStack;
    Stack<Integer> maxStack;


    public MaxStack(){
        dataStack=new Stack<Integer>();
        maxStack=new Stack<Integer>();
    }

    public void push(int val){
        if(maxStack.isEmpty() || val>=maxStack.peek()){
            maxStack.push(val);
        }
        dataStack.push(val);
    }

    public int top(){
        return  dataStack.peek();
    }

    public int peekMax(){
        return maxStack.peek();
    }

    public int pop(){
        if(!maxStack.isEmpty() && dataStack.peek()==maxStack.peek()){
            maxStack.pop();
        }
        return dataStack.pop();
    }

    public int popMax(){
        int max=maxStack.peek();
        Stack<Integer> tmp=new Stack<>();

        while(dataStack.peek()!=maxStack.peek()){
            tmp.push(dataStack.pop());
        }

        dataStack.pop();
        maxStack.pop();

        while(!tmp.isEmpty()){
            push(tmp.pop());
        }
        return max;
    }


}

public class Test {
    public static void main(String args[]){
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(1);
        stack.push(5);
        System.out.println(stack.top());
        System.out.println(stack.popMax());
        System.out.println(stack.top());
        System.out.println(stack.peekMax());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
