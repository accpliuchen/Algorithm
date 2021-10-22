package com.interview.exercise.exercise6;

import java.util.Arrays;

//https://www.cnblogs.com/grandyang/p/4128268.html
//https://blog.csdn.net/qq_30251505/article/details/52964627
//https://blog.csdn.net/zhouworld16/article/details/14121477
public class Test {

    public String covert(String s,int numRows){
        if(numRows==1){
            return s;
        }

        String[] strs=new String[numRows];
        Arrays.fill(strs,"");

        boolean down=true;

        for(int i=0,k=0;k<s.length();k++){
            strs[i]+=s.substring(k,k+1);

            if (down) {
                if (i < numRows - 1) {
                    i++;
                } else {
                    i--;
                    down = false;
                }
            } else {
                if (i > 0) {
                    i--;
                } else {
                    i++;
                    down = true;
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str);
        }

        return sb.toString();
    }


    public static void main(String args[]){
        String result="PAHNAPLSIIGYIR";

        Test test=new Test();

        System.out.println(test.covert("PAYPALISHIRING",3));
    }
}
