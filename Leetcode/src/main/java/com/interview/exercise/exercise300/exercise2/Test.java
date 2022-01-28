package com.interview.exercise.exercise300.exercise2;

import java.util.Arrays;

//https://blog.csdn.net/weixin_43362002/article/details/104854357
public class Test {

    public int lengthOfLIS(int[] nums){
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }

        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);

        for(int i=0;i< nums.length;i++){
            for(int j=0;j<i;j++){
               if(nums[i]>nums[j]){
                   System.out.println("===========dp[i]============="+dp[i]);
                   System.out.println("===========dp[j]============="+(dp[j]+1));
                   dp[i]=Math.max(dp[i],dp[j]+1);
               }
            }
        }

        int result=0;

        for(int i=0;i<dp.length;i++){
            result=Math.max(result,dp[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};

        Test test=new Test();

        int result=test.lengthOfLIS(nums);

        System.out.println("result value is "+ result);
    }
}
