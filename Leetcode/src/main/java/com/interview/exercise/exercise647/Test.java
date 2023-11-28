package com.interview.exercise.exercise647;

public class Test {

    public int countSubstrings(String s) {
        int tot = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                StringBuilder rsub = new StringBuilder(sub);
                if (sub.equals(rsub.reverse().toString())) {
                    tot++;
                }
            }
        }
        return tot;
    }

    public static void main(String args[]){
        String str="aaa";

        Test test=new Test();
        int result=test.countSubstrings(str);

        System.out.println(result);

    }
}
