package com.test.interview.stack.implementation;

//https://www.techiedelight.com/stack-implementation-in-java/
public class StackExample {

    class Stack {
        private int arr[];
        private int top;
        private int capacity;


        Stack(int size){
            arr=new int[size];
            capacity=size;
            top=-1;
        }

        public void push(int x){
            if(isFull()){
                System.out.println("Overflow\nProgram Terminated\n");
                System.exit(-1);
            }
            arr[++top]=x;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Underflow\nProgram Terminated");
                System.exit(-1);
            }
            return arr[top--];
        }

        public int peek(){
            if(!isEmpty()){
                return arr[top];
            }else{
                System.exit(-1);
            }
            return -1;
        }

        public int size(){
            return top+1;
        }

        public boolean isEmpty(){
            return top==-1;
        }

        public boolean isFull(){
            return top==capacity-1;
        }
    }

    public static void main(String args[]){

    }

}
