package com.interview.exercise.exercise215;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test {

//    public static int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length-k];
//    }

    public int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> heap=new PriorityQueue<>();

        for(int num:nums){
            heap.add(num);
            if(heap.size()>k){
                heap.remove();
            }
        }
        return heap.peek();
    }

    
    public static void main(String args[]){
        int[] nums={3,2,1,5,6,4};
        Test test=new Test();
        int result=test.findKthLargest(nums,2);

        System.out.println("result value is "+ result);

    }
}
