package com.interview.exercise.exercise279;

import java.util.Arrays;

//https://blog.csdn.net/qq_41645636/article/details/99482043
public class Test {

//    public int numSequares(int n){
//        int[] dp=new int[n+1];
//        Arrays.fill(dp,Integer.MAX_VALUE);
//
//
//        for(int i=1;i*i<n;i++){
//            dp[i*i]=1;
//        }
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;i+j*j<=n;j++){
//                dp[i+j*j]=Math.min(dp[i]+1,dp[i+j*j]);
//            }
//        }
//        return dp[n];
//    }

    public int numSequares(int n){

        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[0]=0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {

                if(i==4)
                    System.out.println("i value is 4");

                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);

                System.out.println("i value is "+i+"============"+dp[i]);
                System.out.println("============"+dp[i - j * j]+1);
            }
        }

        return dp[n];
    }



    public static void main(String args[]){
        //int nums=12;
        int nums=4;

        Test test=new Test();
        int result=test.numSequares(nums);

        System.out.println("result value is "+ result);

    }
}
