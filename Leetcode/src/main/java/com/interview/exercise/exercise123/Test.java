package com.interview.exercise.exercise123;

import java.text.DecimalFormat;

public class Test {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int K = 2;
        int[][] dp = new int[prices.length][K + 1];

        for (int k = 1; k <= K; k++) {
            int min = prices[0];
            for (int i = 1; i < prices.length; i++) {
                //找出第 1 天到第 i 天 prices[buy] - dp[buy][k - 1] 的最小值
                min = Math.min(prices[i] - dp[i][k - 1], min);
                //比较不操作和选择一天买入的哪个值更大
                dp[i][k] = Math.max(dp[i - 1][k], prices[i] - min);
            }
        }
        return dp[prices.length - 1][K];
    }

    public static void main(String[] args) {
        int[]  prices = {3,3,5,0,0,3,1,4};

        Test test=new Test();
        int result=test.maxProfit(prices);

        System.out.println("result value is "+ result);

    }
}
