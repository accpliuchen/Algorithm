package com.interview.exercise.exercise1047;

import java.util.Deque;
import java.util.ArrayDeque;

public class Test {

    public String removeDuplicates(String s) {
        if(s==null || s.length()==0){
            return s;
        }

        Deque<Character> stack=new ArrayDeque<>();

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peekFirst()==ch){
                stack.pollFirst();
            }else{
                stack.offerFirst(ch);
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!stack.isEmpty()){
           sb.append(stack.pollLast());
        }

        return sb.toString();
    }

    public static void main(String args[]){
        String str="abbaca";

        Test test=new Test();

        String result=test.removeDuplicates(str);
        System.out.println(result);
    }
}
