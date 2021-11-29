package com.interview.exercise.exercise1556;

//https://leetcode.com/problems/thousand-separator/

public class Test {

    private final static int SPL = 3;

    public String thousandSeparator(int n) {
        if (n == 0) return "0";

        StringBuilder builder = new StringBuilder();
        for (int i = 1; n > 0; n /= 10, i++) {
            builder.append(n % 10);

            if (i % SPL == 0 && n / 10 > 0)
                builder.append(".");
        }
        return builder.reverse().toString();
    }


    public static void main(String args[]) {
        int num = 987;

        Test test = new Test();
        String result = test.thousandSeparator(987);
        System.out.println(result);
    }
}
