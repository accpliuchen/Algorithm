package com.interview.exercise.exercise9;

public class Test {

    public static boolean isPalindrome(int x){
        if (x < 0 || x != 0 && x % 10 == 0)
            return false;
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;

            System.out.println("reverse value is"+reverse);

            x = x / 10;
            System.out.println("x value is"+x);
        }

        System.out.println("final reverse value is"+reverse);
        System.out.println("final x value is"+x);

        return (reverse == x || reverse / 10 == x);

    }


//    public static boolean isPalindrome(int n){
//        char str[]=Integer.toString(n).toCharArray();
//
//        for(int i=0,j=str.length-1;i<j;i++,j--) {
//            if(str[i]!=str[j])
//                return false;
//        }
//        return true;
//    }

    public static void main(String args[]){
        boolean result=isPalindrome(1221);

        System.out.println(result);
    }
}
