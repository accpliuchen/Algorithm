package com.interview.exercise.exercise2009;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

    public int minOperations(int[] nums) {
        Arrays.sort(nums); // Sort the array

        int n = nums.length;
        int maxNumsInWindow = 0;

        Deque<Integer> numsInWindow = new ArrayDeque<>();
        for (int num : nums) {
            // Advance the window
            while (numsInWindow.size() > 0 && num - numsInWindow.peekFirst() >= n) {
                numsInWindow.poll();
            }

            // Add the new number to the window (if it's not a duplicate)
            if(numsInWindow.size() == 0 || ! numsInWindow.peekLast().equals(num)) {
                numsInWindow.offer(num);
            }

            maxNumsInWindow = Math.max(maxNumsInWindow, numsInWindow.size());
        }

        return n - maxNumsInWindow;
    }

    public static void main(String args[]){
//        int[] nums=new int[]{1,2,3,5,6};

        int[] nums=new int[]{1,10,100,1000};

        Test test=new Test();
        int result=test.minOperations(nums);

        System.out.println(result);
    }
}
