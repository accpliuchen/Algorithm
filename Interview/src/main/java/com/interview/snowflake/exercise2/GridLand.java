package com.interview.snowflake.exercise2;

import java.util.ArrayList;

public class GridLand {

    static String[] gridLand(String[] inp) {
        int dp[][] = new int[11][11];
        for(int i = 0; i<11; i++) dp[i][0] = 1;
        for(int j = 0; j<11; j++) dp[0][j] = 1;
        for(int i = 1; i<11; i++) {
            for(int j =1; j<11; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        ArrayList<String> res = new ArrayList<String>();
        for(int i=0; i<inp.length; i++) {
            String s = res.get(i);
            int x, y, z;
            String[] ss = s.split(" ");
            x=Integer.valueOf(ss[0]); y=Integer.valueOf(ss[1]); z=Integer.valueOf(ss[2]);
            z+=1;
            String result = "";
            while(x>0&&y>0) {
                if(dp[x-1][y]>=z) {
                    result+="H";
                    x--;
                }
                else {
                    result += "V";
                    z-=dp[x-1][y];
                    y--;
                }
            }
            while(y>0){ result+="V";y--;}
            while(x>0){ result+="H";x--;}
            res.add(result);
        }
        String[] r = new String[res.size()];
        for(int i=0; i<res.size(); i++){
            r[i] = res.get(i);
        }
        return r;
    }
}
