package com.interview.exercise.exercise125;

import java.util.Locale;

public class Test {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9" +"]+","");
        //s = s.toLowerCase().replaceAll("[^a-z0-9" +"]+", "");
        int len=s.length();

        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-1-i))
                return false;
        }
        return true;
    }

    public static void main(String args[]){
        //String str="A man, a plan, a canal: Panama";
        String str="race a car";

        Test test=new Test();

        boolean result=test.isPalindrome(str);

        System.out.println("result value is "+result);

    }
}
