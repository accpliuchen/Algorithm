package com.interview.exercise.exercise3;

import java.util.Stack;

public class Test {

    public Stack<Integer> sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help=new Stack<Integer>();

        while(!stack.isEmpty()){
            int cur=stack.pop();
            while(!help.isEmpty() && help.peek()<cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while(!help.isEmpty()){
            stack.push(help.pop());
        }

        return stack;
    }

    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();
        stack.push(new Integer(4));
        stack.push(new Integer(8));
        stack.push(new Integer(7));
        stack.push(new Integer(5));

        Test test=new Test();

        Stack<Integer> temp=test.sortStackByStack(stack);
        for (Integer item: temp) {
            System.out.println(item);
        }

    }
}
