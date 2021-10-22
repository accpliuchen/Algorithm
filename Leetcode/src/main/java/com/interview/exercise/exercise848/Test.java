package com.interview.exercise.exercise848;

//https://zhuanlan.zhihu.com/p/84886499
//https://blog.csdn.net/u011439455/article/details/80642138
public class Test {

    public String shiftingLetters(String s, int[] shifts) {

        StringBuilder builder=new StringBuilder(s);
        int n=shifts.length;
        int pre=0;

        for(int i=n-1;i>=0;i--){
            pre=(pre+shifts[i]%26)%26;
            int tmp=(builder.charAt(i)-'a'+pre)%26;
            builder.setCharAt(i,(char)(tmp+'a'));
        }

        return builder.toString();
    }

    public static void main(String args[]){
        String str="abc";
        int[] shifts=new int[]{3,5,9};

        Test test=new Test();
        String result=test.shiftingLetters(str,shifts);

        System.out.println(result);
    }
}
