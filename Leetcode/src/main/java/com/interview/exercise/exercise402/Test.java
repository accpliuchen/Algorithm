package com.interview.exercise.exercise402;

import java.util.Stack;

public class Test {

    public String removeKdigits(String num, int k) {
        int size=num.length();

        if(k==size) return "0";

        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<num.length()){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();

        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
             sb.deleteCharAt(0);
        return sb.toString();
    }

    public static void main(String args[]){
       //String num = "1111";
        String num="1432219";
       int k = 3;

       Test test=new Test();
       String result=test.removeKdigits(num,k);

       System.out.println("result value is "+ result);
    }
}
