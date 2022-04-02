package com.interview.exercise.exercise122;

public class Test {

//    public int maxProfit(int[] prices) {
//        int ans=0;
//        for(int i=1;i<prices.length;i++){
//            if(prices[i]>prices[i-1]){
//                ans+=(prices[i]-prices[i-1]);
//            }
//        }
//        return ans;
//    }

    public int maxProfit(int[] prices) {
         if(prices.length==0 && prices==null) return 0;

         int count=prices.length;
         int[][] dp=new int[count][2];

         dp[0][1]=-prices[0];

         for(int i=1;i<count;i++){
             dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+ prices[i]);
             dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
         }

         return dp[count-1][0];
    }


    public static void main(String args[]){
        int[] prices = new int[] {7,1,5,3,6,4};

        Test test=new Test();

        System.out.println(test.maxProfit(prices));
    }
}
