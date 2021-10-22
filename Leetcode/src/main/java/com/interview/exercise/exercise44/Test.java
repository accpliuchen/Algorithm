package com.interview.exercise.exercise44;

public class Test {

    public boolean isMatch(String s, String p){
        if(p.equals("*")) return true;

        int n=p.length();
        int m=s.length();

        boolean[][] dp=new boolean[m+1][1+1];

        for(int i=0;i<=m;++i)
            for(int j=1;j<=n;++j)

                if(p.charAt(j-1)=='*') {
                    boolean matchEmpty = dp[i][j - 1];
                    boolean matchNew = i > 0 && dp[i - 1][j];
                    dp[i][j] = matchEmpty || matchNew;
                }else{
                    dp[i][j] = i > 0 && isMatch(s.charAt(i - 1),p.charAt(j - 1)) && dp[i - 1][j - 1];
                }
                return dp[m][n];
    }

    private boolean isMatch(char c1, char c2) {
        return c1 == c2 || c2 == '?';
    }

    public static void main(String args[]){
        String s = "aa", p = "*";

        Test test=new Test();

        System.out.print(test.isMatch(s,p));
    }
}
