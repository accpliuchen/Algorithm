package com.interview.exercise.exercise5;

import java.util.Stack;

public class Test {


    public static Stack<Integer> sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help=new Stack<Integer>();

        while(!stack.isEmpty()){
            int cur=stack.pop();
            if(!help.isEmpty() && help.peek()<cur){
                stack.push(help.pop());
            }

            help.push(cur);
        }

        while(!help.isEmpty()){
           stack.push(help.pop());
        }
        return stack;
    }

    public static Stack<Integer> stackSorting(Stack<Integer> stack) {
        Stack<Integer> t = new Stack<>();
        while(!stack.isEmpty()) {
            int item = stack.pop();
            while(!t.isEmpty() && t.peek() > item) stack.push(t.pop());
            t.push(item);
        }
        while(!t.isEmpty()) stack.push(t.pop());

        return stack;
    }

    public static void main(String args[]){

        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(8);
        stack.push(7);
        stack.push(5);

        Stack<Integer> item=Test.stackSorting(stack);

        for(Integer items:item){
            System.out.println(items);
        }

    }
}
