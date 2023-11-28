package com.interview.exercise.exercise1685;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            int leftCount = i;
            int rightCount = n - 1 - i;

            int leftTotal = leftCount * nums[i] - leftSum;
            int rightTotal = rightSum - rightCount * nums[i];

            ans[i] = leftTotal + rightTotal;
            leftSum += nums[i];
        }

        return ans;
    }

    public static void main(String args[]){
        int[] nums=new int[]{2,3,5};


        Test test=new Test();
        int result[]=test.getSumAbsoluteDifferences(nums);

        IntStream numbersStream= Arrays.stream(result);

        numbersStream.forEach(System.out::println);
    }
}
