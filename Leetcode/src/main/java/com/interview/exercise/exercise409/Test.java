package com.interview.exercise.exercise409;

public class Test {


    public int longestPalindrome(String s){
        int[] charCount=new int[128];
        int maxLength=0;

        for(char c:s.toCharArray()){
            charCount[c]++;
        }

        for(int count:charCount){
            maxLength+=count/2*2;

           if(count%2==1 && maxLength%2==0){
               maxLength++;
           }
        }


        return maxLength;
    }

    public static void main(String arg[]){
        String s="abccccdd";

        Test test=new Test();
        int result=test.longestPalindrome(s);

        System.out.println("result value is "+ result);
    }
}
