package com.interview.exercise.exercise709;

public class Test {

    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);

            if(a>='A' && a<='Z'){
                a+='a'-'A';
            }
            sb.append((char)a);
        }

        return sb.toString();
    }

    public static void main(String args[]){
        String str="LOVELY";

        Test test=new Test();
        String result=test.toLowerCase(str);

        System.out.println(result);
    }
}
