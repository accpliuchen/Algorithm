package com.interview.exercise.exercise38.exercise1;

public class Test {
    public String countAndSay(int n) {
        String currentString = "1";
        for (int i = 2; i <= n; i++) {
            String nextString = "";
            for (int j = 0, k = 0; j < currentString.length(); j = k) {
                while (k < currentString.length() && currentString.charAt(k) == currentString.charAt(j)) k++;
                nextString += Integer.toString(k - j) + currentString.charAt(j);
            }
            currentString = nextString;
        }
        return currentString;
    }

    public static void main(String args[]){
        Test test=new Test();
        String result=test.countAndSay(3322251);

        System.out.println("result value is "+ result);
    }
}
