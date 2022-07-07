package edu.laicode.exercise237;

import java.util.Stack;

public class Test {

    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();

        int res=0;
        int start=-1;

        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
               stack.push(i);
           }else{
               if(stack.isEmpty()){
                   start=i;
               }else{
                   stack.pop();
                   if(stack.isEmpty()){
                       res=Math.max(res,i-start);
                   }else{
                       res=Math.max(res,i-stack.peek());
                   }
               }
           }
        }

        return res;
    }

    public static void main(String args[]){
        //String str="(()";

        String str=")()())";

        Test test=new Test();

        int result=test.longestValidParentheses(str);

        System.out.println(result);
    }
}