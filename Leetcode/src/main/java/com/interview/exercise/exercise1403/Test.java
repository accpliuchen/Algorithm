package com.interview.exercise.exercise1403;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public List<Integer> minSubsequence(int[] nums){
        List<Integer> list=new ArrayList<>();

        int count= nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int num:nums) sum+=num;
        int cur=0;

        System.out.println("sum value is "+ sum);

        for(int i=count-1;i>=0;i--){
            cur+=nums[i];

            System.out.println("current value is "+ cur);
            list.add(nums[i]);
            if(cur>sum-cur) break;
        }


        return list;
    }

    public static void main(String[] args) {
        int[] nums={4,3,10,9,8};

        Test test=new Test();
        List<Integer> result=test.minSubsequence(nums);

        System.out.println("result value is "+ result.size());
    }
}
