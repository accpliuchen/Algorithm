package com.interview.exercise.array.example1;

import java.util.Arrays;

public class Test {

    private static int getAns(int[] arr,int currentIndex,int target,int[][] dp){
        if(target==0) return 0;
        if(currentIndex==arr.length) return -1;
        if(arr[currentIndex]==0) return getAns(arr,currentIndex+1,target,dp);
        if(dp[target][currentIndex]!=-2) return dp[target][currentIndex];

        int ans=Integer.MAX_VALUE;
        int currentCount=0;

        while(currentCount*arr[currentIndex]<=target){
            int leftCount=getAns(arr,currentIndex+1,target-currentCount*arr[currentIndex],dp);

            if(leftCount!=-1){
                ans=Math.min(ans,leftCount+currentCount);
            }
            currentCount++;
        }

        if(ans==Integer.MAX_VALUE) return dp[target][currentIndex]=-1;
        return dp[target][currentIndex]=ans;
    }

    public static int getMinCount(int[] arr,int k){
        int[][] dp=new int[k+1][arr.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-2);
        }

        int ans=getAns(arr,0,k,dp);
        return ans;
    }
}
