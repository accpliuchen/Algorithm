package com.interview.exercise.exercise1425;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Test {

    public int constrainedSubsetSum(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            //nums[i] += !dq.isEmpty() ? nums[dq.peekFirst()] : 0;
            if(!dq.isEmpty()){
                nums[i] +=nums[dq.peekFirst()];
            }else{
                nums[i] +=0;
            }

            while (!dq.isEmpty() && (i - dq.peekFirst() >= k || nums[i] >= nums[dq.peekLast()])) {
                if (nums[i] >= nums[dq.peekLast()])
                    dq.pollLast();
                else
                    dq.pollFirst();
            }

            if (nums[i] > 0) {
                dq.offerLast(i);
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }

    public static void main(String args[]){
        int[] nums=new int[]{10,2,-10,5,20};
        //int[] nums=new int[]{10,-2,-10,-5,20};

        int k=2;

        Test test=new Test();

        int result=test.constrainedSubsetSum(nums,k);

        System.out.println(result);
    }
}
