package com.interview.ibm.exericse;

//https://leetcode.com/discuss/interview-question/985132/IBM-or-OA-or-Selecting-Stocks
public class Test {

    public int knapsack(int[] currentValue, int[] futureValue, int saving){
//        int[] dp = new int[saving+1];
//        int N = currentValue.length;
//        for (int i = 1; i <= N; i++){
//            int weight = currentValue[i-1], value = futureValue[i-1] - currentValue[i-1];
//            for (int j = saving; j >= weight; j--){
//                dp[j] = Math.max(dp[j], dp[j-weight]+value);
//            }
//        }
//        return dp[saving];

        int dp[][] = new int[currentValue.length+1][saving+1];
        int n = currentValue.length;

        for(int i = 1;i<=n;++i)
        {
            for(int j =1;j<=saving;++j )
            {
                if(currentValue[i-1] <= j)
                {
                    dp[i][j] =Math.max(dp[i-1][j], dp[i-1][j-currentValue[i-1]]+futureValue[i-1] - currentValue[i-1]);
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][saving];
    }

    public static void main(String args[]){
        int saving = 250;
        int[] currentValue = new int[]{175, 133, 109, 201, 97};
        int[] futureValue = new int[]{200, 125, 128, 228, 133};

        Test test=new Test();

        int result=test.knapsack(currentValue,futureValue,saving);
        System.out.println(result);

    }
}
