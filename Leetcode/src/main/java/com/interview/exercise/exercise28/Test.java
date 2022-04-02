package com.interview.exercise.exercise28;

public class Test {

    public int strStr(String haystack, String needle) {
        if(needle==null || needle.equals(""))
            return 0;
        else if (!haystack.contains(needle))
            return -1;
        else{
            for(int i=0;i<haystack.length();i++){
                String str=haystack.substring(i,i+needle.length());
                System.out.println(str);
                if(str.equals(needle)){
                    return i;
                }
            }
        }

        return 0;
    }

    public static void main(String args[]){
        String haystack = "hello", needle = "ll";


        Test test=new Test();

        System.out.println(test.strStr(haystack,needle));
    }
}
