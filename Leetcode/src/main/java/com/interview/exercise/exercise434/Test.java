package com.interview.exercise.exercise434;

public class Test {

    public int countSegments(String s) {
        int count=0;
        boolean flag=true;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ' && flag){
                flag = false;
                count++;
            }
            else if(s.charAt(i) == ' '){
                flag = true;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String str="Hello, my name is John";

        Test test=new Test();
        int result=test.countSegments(str);

        System.out.println(result);
    }
}
