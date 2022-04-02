package com.interview.tiktokexercise;

public class Test {

    public static int getSum(String input_str, int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += input_str.charAt(i) - '0';
        }
        return sum;
    }


    public static int getValue(String str,int left,int right){
        int digit=0;
        int result=0;

        for(int i=right;i>=left;i--){
            result+=(int)Math.pow(2,digit);
            digit++;
        }
        return result;
    }

    public static String getSubstring(String input_str, int k) {
        int left = 0; int right = 0;

        int sum = 0;
        int minValue=Integer.MAX_VALUE;

        String smallest = input_str;

        while (left <= right) {
            if (right < input_str.length()) {
                sum = getSum(input_str, left, right);
            }
            else {
                return smallest;
            }

            if (sum < k) {
                right++;
            }
            else if (sum > k) {
                left++;
            }
            else {
                String candidate = input_str.substring(left, right + 1);
                int curValue=getValue(input_str,left,right);

                if (candidate.length() < smallest.length() && curValue<=minValue) {
                    smallest = candidate;
                    minValue=curValue;
                }
                left++;

            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        String str=Test.getSubstring("110011101",4);

        System.out.println(str);
    }
}
