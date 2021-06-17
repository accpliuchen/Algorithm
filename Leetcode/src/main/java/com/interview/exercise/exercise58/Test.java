package com.interview.exercise.exercise58;

public class Test {

    public int lengthOfLastWord(String s){
        int len=0;

        String x=s.trim();

        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==' ')
                len=0;
            else
                len++;
        }
        return len;
    }

    public static void main(String args[]){
        String input = "Geeks For Geeks rwerwerwerwer ";

        Test test=new Test();
        System.out.println(test.lengthOfLastWord(input));
    }
}
