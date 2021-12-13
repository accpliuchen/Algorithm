package com.interview.exercise.exercise151;

public class Test {

    public int numDistinct(String s, String t) {
//        int[][] dp=new int[s.length()+1][t.length()+1];
//
//        for(int i=0;i<dp.length;i++){
//            dp[i][t.length()]=1;
//        }
//
//        for(int j=t.length()-1;j>=0;--j){
//            for(int i=s.length()-1;i>=0;--i){
//                if(s.charAt(i)==t.charAt(j)){
//                    dp[i][j] = dp[i+1][j+1] + dp[i+1][j];
//                }else{
//                    dp[i][j] = dp[i+1][j];
//
//                    System.out.println("else i value is "+i +" j value is "+j);
//                    System.out.println("else  dp[i+1][j] "+dp[i+1][j]);
//                    System.out.println("else  dp[i][j] "+dp[i][j]);
//                    System.out.println("\n");
//                }
//            }
//        }
//        return dp[0][0];

        //sLength和tLength分别是两个字符串的长度
        int sLength = s.length();
        int tLength = t.length();
        int[][] dp = new int[tLength + 1][sLength + 1];

        //base case 边界条件
        for (int j = 0; j <= sLength; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i <= tLength; i++) {
            for (int j = 1; j <= sLength; j++) {
                //下面是递推公式
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    //如果字符串t的第i个字符和s的第j个字符一样，
                    //那么有两种选择
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    //如果字符串t的第i个字符和s的第j个字符不一样，
                    //我们只能用字符串s的前j-1个字符来计算他包含的数量
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[tLength][sLength];
    }

    public static void main(String args[]){
        String s = "rabbbit", t = "rabbit";

        Test test=new Test();
        int result=test.numDistinct(s,t);

        System.out.println("result value is "+result);

    }
}
