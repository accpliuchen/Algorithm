package com.interview.exercise.exercise121;

public class Test {

//    public int maxProfit(int[] prices) {
//        int cur=0,res=0;
//        for(int i=1;i<prices.length;++i){
//
//            System.out.println("cur value is "+ cur);
//            System.out.println("prices[i] value is "+ prices[i]);
//            System.out.println("prices[i-1] value is "+ prices[i-1]);
//            System.out.println("res "+ res);
//
//            System.out.println("\n");
//
//            cur=Math.max(cur+prices[i]-prices[i-1],0);
//            res=Math.max(res,cur);
//        }
//        return res;
//    }

//    public int maxProfit(int[] prices){
//        if(prices==null || prices.length==0) return 0;
//        int[] dp=new int[prices.length];
//        int minPrice=prices[0];
//
//        for(int i=1;i<prices.length;i++){
//
//            System.out.println("minPrice value is "+ minPrice);
//            System.out.println("prices[i] value is "+ prices[i]);
//            System.out.println("dp[i-1] value is "+ dp[i-1]);
//            System.out.println("dp[i]  i is "+ i+" "+dp[i]);
//
//            System.out.println("\n");
//
//            minPrice=Math.min(minPrice,prices[i]);
//            dp[i]=Math.max(dp[i-1],prices[i]-minPrice);
//        }
//
//        return dp[prices.length-1];
//    }

//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        int minPrice = Integer.MAX_VALUE;
//
//        for(int i = 0 ; i < prices.length ; i++){
//            if(prices[i] < minPrice){
//                minPrice = prices[i];
//            }
//            else if(prices[i] - minPrice > maxProfit){
//                maxProfit = prices[i] - minPrice;
//            }
//        }
//        return maxProfit;
//    }

    public int maxProfit(int[] prices){
        if(prices==null || prices.length==0) return 0;

        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){

            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);

            System.out.println("\n");
        }
        return max;
    }

    public static void main(String args[]){
        int[] prices=new int[]{7,1,5,3,6,4};

        Test test=new Test();

        int result=test.maxProfit(prices);
        System.out.println("result value is "+ result);
    }
}
