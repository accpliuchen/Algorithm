package com.interview.exercise.exercise115;

//https://www.cnblogs.com/lavender-pansy/p/12525950.html
//https://blog.csdn.net/a1439775520/article/details/104387417

public class Test {

    public int numDistinct(String s, String t) {

        if(s.length()==0 && t.length()==0)
            return 0;

        int[][] dp=new int[t.length()+1][s.length()+1];

        for(int i=0;i<=s.length();i++){
            dp[0][i]=1;
        }



        return -1;
    }

    public static void main(String args[]){
        String s = "rabbbit", t = "rabbit";

        Test test=new Test();

        System.out.println(test.numDistinct(s,t));

    }
}
