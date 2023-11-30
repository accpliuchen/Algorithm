package com.interview.exercise.exercise456;

import java.util.Stack;

public class Test {

    public boolean find132pattern(int[] nums){
        int e3=Integer.MIN_VALUE;

        Stack<Integer>stack=new Stack<>();

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<e3){
                return true;
            }

            while(!stack.isEmpty() && nums[i]>stack.peek()){
                e3=stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }

    public static void main(String args[]){
        int[] nums=new int[]{1,2,3,4};

        Test test=new Test();

        System.out.println(test.find132pattern(nums));
    }
}
