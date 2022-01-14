package com.interview.exercise.exercise139;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Test {

    public boolean wordBreak(String s, List<String> ws) {
        Set<String> set = new HashSet<>();
        for (String str : ws) set.add(str);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (!dp[j]) continue;
                System.out.print("==="+s.substring(j, i + 1));
                if (set.contains(s.substring(j, i + 1))) {
                    System.out.println("   value j is "+ j +" value i is "+i +" ===true");
                    dp[i + 1] = true;
                    break;
                }
            }
            System.out.println();
        }
        return dp[s.length()];
    }




    public static void main(String[] args) {
        String str = "leetcode";

        List<String> list=new ArrayList<String>();
        list.add("leet");
        list.add("code");

        Test test=new Test();

        boolean result=test.wordBreak(str,list);

        System.out.println("result value is "+ result);
    }
}
