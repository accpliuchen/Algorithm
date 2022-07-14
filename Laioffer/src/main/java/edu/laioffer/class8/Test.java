package edu.laioffer.class8;

import java.util.Deque;
import java.util.ArrayDeque;

public class Test {


    public String deduplicate(String input){
        if(input==null || input.length()<=1){
            return input;
        }

        char[] array=input.toCharArray();
        Deque<Character> stack=new ArrayDeque<>();
        int fast=0;
        
        while(fast<array.length){
            char curChar=array[fast];

            if(!stack.isEmpty() && stack.peekFirst()==curChar){
                while(fast<array.length &&  array[fast]==curChar){
                    fast++;
                }
                stack.pollFirst();
            }else{
                stack.offerFirst(curChar);
                fast++;
            }
        }

       int len=stack.size();
       for(int i=len-1;i>=0;i--){
           array[i]=stack.pollFirst();
       }
       return new String(array,0,len);
    }
    public static void main(String args[]){
        //String str="abbbbazw";
        String str="bcabc";

        Test test=new Test();
        String result=test.deduplicate(str);

        System.out.println(result);
    }
}
