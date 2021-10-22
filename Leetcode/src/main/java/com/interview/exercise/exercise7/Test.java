package com.interview.exercise.exercise7;

public class Test {

    public int reverse(int x){
        long res = 0;
        while ( x != 0) {
            int l = x %10;
            res = res * 10 + l;
            if (res >= Integer.MAX_VALUE  || res <= Integer.MIN_VALUE) return 0;
            x /= 10;
        }
        return (int) res;
    }

    public static void main(String args[]){
        int x=123;

        Test test=new Test();

        System.out.println(test.reverse(123));

    }
}
