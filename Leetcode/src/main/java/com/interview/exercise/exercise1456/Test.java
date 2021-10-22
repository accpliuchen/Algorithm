package com.interview.exercise.exercise1456;

//https://www.cnblogs.com/huansky/p/13488234.html
public class Test {

    public int maxVowels(String s, int k) {
        int right =0;
        int sum = 0;
        int max = 0;

        while(right<s.length()){
            sum += isYuan(s.charAt(right));
            right++;

            if(right>=k){
                max=Math.max(max,sum);
                sum-=isYuan(s.charAt(right-k));
            }
        }
        return max;

    }


    public int isYuan(char s){
        return s=='a' || s=='e' ||s=='i' ||s=='o' ||s=='u' ?1:0;
    }
}
