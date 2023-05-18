package com.interview.exercise.exercise239.exercise1;

import java.util.Deque;
import java.util.ArrayDeque;

public class Test {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length<=0 || k<=0 ){
            return new int[0];
        }

        Deque<Integer> deque=new ArrayDeque<Integer>();

        int[] total=new int[nums.length+1-k];
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(!deque.isEmpty() && deque.getFirst()<=i-k){
                deque.removeFirst();
            }


            while(!deque.isEmpty() && nums[deque.getLast()]<nums[i]){
                System.out.println("the last value is "+ deque.getLast());
                deque.removeLast();
            }

            deque.addLast(i);

            if(i>=k-1){
                total[index++]=nums[deque.getFirst()];
            }
        }
        return total;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static  void main(String args[]){
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;

        Test test=new Test();
        int[] result=test.maxSlidingWindow(nums,k);

        printArray(result);
    }
}
