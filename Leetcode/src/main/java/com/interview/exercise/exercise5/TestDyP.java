package com.interview.exercise.exercise5;

public class TestDyP {


    public String longestPalindrome(String s){
//        if(str==null || str.length()<2) return str;
//        int left=0;
//        int right=0;
//        int max=1;
//        int size=str.length();
//
//        boolean[][] dp=new boolean[size][size];
//
//        for(int i=0;i<size;i++){
//            dp[i][i]=true;
//            for(int j=i-1;j>=0;j--){
//                if(str.charAt(i)==str.charAt(j) && (dp[j+1][i-1] || j+1>i-1)){
//                    dp[j][i]=true;
//                    if(i-j+1>max){
//                        left=j;
//                        right=i;
//                        max=i-j+1;
//                    }
//                }
//            }
//        }
//
//
//        return str.substring(1,right+1);

        if(s==null || s.length() < 2) return s;
        int l = 0;
        int h = 0;
        int max = 1;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for(int i=0; i<len; i++){
            dp[i][i] = true;
            for(int j=i-1; j>=0; j--){
                //&& (dp[j+1][i-1] || j+1>i-1
                if(s.charAt(i) == s.charAt(j)){
                    if((dp[j+1][i-1] || j+1>i-1)) {
                        dp[j][i] = true;
                        if (i - j + 1 > max) {
                            l = j;
                            h = i;
                            max = i - j + 1;
                        }
                    }
                }
            }
        }
        return s.substring(l, h+1);
    }

    public static void main(String[] args) {
        TestDyP test=new TestDyP();
        String str = "babad";

        String result=test.longestPalindrome(str);

        System.out.println("result value is "+ result);
    }
}
