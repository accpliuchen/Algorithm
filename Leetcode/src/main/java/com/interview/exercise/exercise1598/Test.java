package com.interview.exercise.exercise1598;

import java.util.Stack;

public class Test {

    public int minOperations(String[] logs) {
       Stack<String> stack=new Stack<>();

       for(String str:logs){
           if(!str.equals("../") && !str.equals("./")){
               stack.push(str);
           }

           if(str.equals("../") && !stack.isEmpty()){
               stack.pop();
           }

           if(stack.equals("./")){
               continue;
           }
       }

       return stack.size();
    }

    public static void main(String args[]){
        //String[] logs = new String[]{"d1/","d2/","../","d21/","./"};
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};

        Test test=new Test();
        int result=test.minOperations(logs);

        System.out.println("result value is "+ result);
    }
}
