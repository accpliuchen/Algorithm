package com.interview.exercise.exercise344;

//344. Reverse String
public class Test {

    public String reverseString(String s){

        if(s==null)
            return "";

        char c[]=s.toCharArray();
        int len=s.length();
        int i=0;
        int j=len-1;

        while(i<j){
            char tmp=c[i];
            c[i]=c[j];
            c[j]=tmp;
            i++;
            j--;
        }

        return new String(c);
    }

    public static void main(String args[]){
        Test test=new Test();
        String str="hello";

        System.out.println(test.reverseString(str));
    }
}
