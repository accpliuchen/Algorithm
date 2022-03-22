package com.interview.exercise.exercise400;

public class Test {

    public int findNthDigit(int n){
        int len=1;
        long count=9;
        int start=1;

        while(n>len*count){
            len += 1;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
        int n=3;

        Test test=new Test();
        int result=test.findNthDigit(n);

        System.out.println("result value is "+ result);
    }
}
