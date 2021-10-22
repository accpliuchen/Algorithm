package com.interview.exercise.exercise1844;

public class Test {

    public String replaceDigits(String s) {
        char[] c=s.toCharArray();

        for(int i=0;i<c.length-1;i=i+2){
            c[i+1]=(char)(c[i]+Integer.parseInt(String.valueOf(c[i+1])));
        }

        return String.valueOf(c);
    }

    public static void main(String args[]){
        String str="a1c2e1";

        Test test=new Test();

        String result=test.replaceDigits(str);

        System.out.println(result);
    }
}
