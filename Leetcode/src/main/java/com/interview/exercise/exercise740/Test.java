package com.interview.exercise.exercise740;

import java.util.Arrays;

public class Test {

    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Find the maximum value in the array
        int max = Arrays.stream(nums).max().getAsInt();

        // Create an array to store the count of each number
        int[] count = new int[max + 1];
        for (int num : nums) {
            count[num]++;
        }

        // Create an array to store the maximum points at each index
        int[] dp = new int[max + 1];

        // Base cases
        dp[1] = count[1] * 1;
        if (max >= 2) {
            dp[2] = Math.max(dp[1], count[2] * 2);
        }

        // Dynamic programming to fill the dp array
        for (int i = 3; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + count[i] * i);
        }

        return dp[max];
    }

    public static void main(String args[]){
        int[] nums = new int[]{3,4,2};

        Test test=new Test();

        int result=test.deleteAndEarn(nums);

        System.out.println("result value is "+ result);

    }
}
