package com.interview.exercise.test.exercise5;

import java.util.*;

public class Test {
   
 public int maxProfit(int k, int[] prices) {
        int pairCount = k / 2;

        List<Set<Integer>> reasonableSellTime = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            Set<Integer> rst = new HashSet<>();
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    rst.add(j);
                }
            }
            reasonableSellTime.add(rst);
        }

        int[][] dp = new int[pairCount][prices.length];
        int min = prices[0];
        int globalMax = -1;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] < min) {
                min = prices[j];
            } else {
                dp[0][j] = prices[j] - min;
                if (dp[0][j] > globalMax) {
                    globalMax = dp[0][j];
                }
            }
        }

        for (int i = 1; i < pairCount; i++) {  // i + 1 is current pair count;
            for (int j = 1; j < prices.length; j++) {
                int max = dp[i][j-1];
                for (int x = j - 1; x >= 0; x--) {
                    if (i > 0 && reasonableSellTime.get(x).contains(j)) {
                        int candidate = prices[j] - prices[x];
                        if (x-1 >= 0) {
                            candidate += dp[i-1][x-1];
                        }
                        if (max < candidate) {
                            max = candidate;
                        }
                    }
                }
                dp[i][j] = max;
                if (max > globalMax) {
                    globalMax = max;
                }
            }
        }

        return globalMax;
    }

    public static void main(String args[]){
        int[] prieces=new int[]{6,-10,12,0,-3,-2,1};

        Test test=new Test();
        int restult=test.maxProfit(3,prieces);

        System.out.println(restult);
    }
}
