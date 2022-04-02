package com.interview.exercise.exercise20;

import java.util.Stack;

public class Test {

    public boolean isValid(String s){
        if(s.isEmpty()){
            return true;
        }

        Stack<Character> stack=new Stack<>();

        for(char c :s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=c)
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String args[]){
        //String s="{[]}";
//        String s="([)]";
//        String s="([";

//        String s="[[{}]()](";

        String s="()";

        Test test=new Test();
        boolean result=test.isValid(s);

        System.out.println("result value is "+result);
    }
}
