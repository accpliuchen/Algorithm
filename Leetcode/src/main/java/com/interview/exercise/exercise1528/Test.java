package com.interview.exercise.exercise1528;

public class Test {

    public String restoreString(String s,int[] indices){
        int length=s.length();
        StringBuilder sb=new StringBuilder("");
        char[] c=new char[length];

        for(int i=0;i<length;i++){
            c[indices[i]]=s.charAt(i);
        }

        sb.append(c);
        return sb.toString();
    }

    public static void main(String args[]){
        int[] indices=new int[]{4,5,6,7,0,2,1,3};
        String str="codeleet";


        Test test=new Test();

        String result=test.restoreString(str,indices);

        System.out.println(result);
    }

}
