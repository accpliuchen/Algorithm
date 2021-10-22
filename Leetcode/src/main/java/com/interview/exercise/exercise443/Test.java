package com.interview.exercise.exercise443;

public class Test {

    public int comparess(char[] chars){
        int indexAns=0,index=0;

        while(index<chars.length){
            char currentChar=chars[index];
            int count=0;

            while(index<chars.length && chars[index]==currentChar){
                index++;
                count++;
            }

            chars[indexAns++]=currentChar;
            if(count!=1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[indexAns++]=c;
                }
            }
        }

        return  indexAns;
    }

    public static void main(String args[]){
        char[] chars={'a','a','b','b','c','c','c'};

        Test test=new Test();

        System.out.println(test.comparess(chars));
    }
}
