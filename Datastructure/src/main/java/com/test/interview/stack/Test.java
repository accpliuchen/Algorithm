package com.test.interview.stack;

public class Test {
}


class Stack{
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int s){
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }

    public void push(long j){
        stackArray[++top]=j;
    }


    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==maxSize-1);
    }

    public static void main(String args[]){
        Stack stack=new Stack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        stack.push(120);



        while(!stack.isEmpty()){
            long value=stack.pop();
            System.out.println(value);
        }

    }
}
