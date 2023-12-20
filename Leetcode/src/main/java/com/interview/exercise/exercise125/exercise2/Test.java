package com.interview.exercise.exercise125.exercise2;

public class Test {

    public boolean isPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--){

            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        // String str="A man, a plan, a canal: Panama";
        String str="race a car";

        Test test=new Test();
        boolean result=test.isPalindrome(str);

        System.out.println("result value is "+ result);
    }
}
