package com.interview.exercise.exercise76.exercise1;

public class Test {

    public String minWindows(String s,String t){
        int[] count=new int[128];

        for(char c:t.toCharArray()){
            count[c]++;
        }

        int from=0;
        int total=t.length();


        return "";
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
//        String s = "ADOBECODEBANC", t = "Q";

        Test test=new Test();
        String result=test.minWindows(s,t);

        System.out.println(" result value is "+ result);
    }
}
