package com.interview.exercise.exercise415;

public class Test {

    public String addStrings(String num1, String num2) {
        if(num1==null || num2==null) return "0";
        int carry=0,i=num1.length()-1,j=num2.length()-1;
        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0 || carry!=0){
            if(i>=0) carry+=num1.charAt(i--)-'0';
            if(j>=0) carry+=num2.charAt(j--)-'0';
            sb.append(carry%10);
            carry/=10;
        }
        return sb.reverse().toString();
    }

    public static void main(String args[]){
        String num1="11";
        String num2="123";

        Test test=new Test();
        System.out.println(test.addStrings(num1,num2));
    }
}
