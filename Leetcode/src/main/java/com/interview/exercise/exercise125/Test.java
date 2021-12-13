package com.interview.exercise.exercise125;

import java.util.Locale;

public class Test {
//    public boolean isPalindrome(String s) {
//        s = s.toLowerCase().replaceAll("[^a-z0-9" +"]+","");
//        //s = s.toLowerCase().replaceAll("[^a-z0-9" +"]+", "");
//        int len=s.length();
//
//        for(int i=0;i<len/2;i++){
//            if(s.charAt(i)!=s.charAt(len-1-i))
//                return false;
//        }
//        return true;
//    }


    public boolean isPalindrome(String s) {
        if(s==null || s.trim().length()==0) return true;

        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;

        while(left<=right){
            Character c1=s.charAt(left);
            Character c2=s.charAt(right);

            if(!Character.isLetterOrDigit(c1)){
                left++;
            }else  if(!Character.isLetterOrDigit(c2)){
                right--;
            }else{
                if(c1!=c2){
                    return false;
                }
                right--;
                left++;
            }
        }

        return true;
    }

    public static void main(String args[]){
        String str="A man, a plan, a canal: Panama";
        //String str="race a car";

        Test test=new Test();

        boolean result=test.isPalindrome(str);

        System.out.println("result value is "+result);

    }
}
