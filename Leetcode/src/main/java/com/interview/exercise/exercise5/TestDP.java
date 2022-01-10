package com.interview.exercise.exercise5;



public class TestDP {

    String result="";
    public String longestPalindrome(String str) {

        if(str==null || str.length()==0) return str;

        for(int i=0;i<str.length();i++){
            helper(str,i,i);
            helper(str,i,i+1);
        }

        return result;

    }

    private void helper(String str,int left,int right){
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }

        String current=str.substring(left+1,right);

        if(current.length()>result.length()){
            result=current;
        }

    }

    public static void main(String[] args) {
        TestDP test=new TestDP();
        String str = "babad";

        String result=test.longestPalindrome(str);

        System.out.println("result value is "+ result);
    }
}