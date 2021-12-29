package com.interview.exercise.exercise680;

public class Test {

    public boolean validPalindrome(String str){
        if(str==null & str.length()==0) return false;

        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return isPalindrome(str,i+1,j) || isPalindrome(str,i,j--);
            }
        }

        return true;
    }

    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str="aba";

        Test test=new Test();

        System.out.println(test.validPalindrome(str));

    }
}
