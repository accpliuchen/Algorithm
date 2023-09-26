package com.interview.exercise.exercise901;

import  java.util.Stack;

public class Test {

    Stack<int[]> stack=new Stack<>();

    public Test(){
    }

    public int next(int price){

         int ans=1;

         while(!stack.isEmpty() && stack.peek()[0]<price){
             ans+=stack.pop()[1];
         }

         stack.push(new int[]{price,ans});
         return ans;
    }
    public static void main(String args[]){

        Test stockSpanner = new Test();
        stockSpanner.next(100); // return 1
        stockSpanner.next(80);  // return 1
        stockSpanner.next(60);  // return 1
        stockSpanner.next(70);  // return 2
        stockSpanner.next(60);  // return 1
        stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        stockSpanner.next(85);  // return 6

        System.out.println("===");
    }
}
