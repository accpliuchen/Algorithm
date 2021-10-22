package com.interview.exercise.exercise921;

public class Test {

    public int minAddToMakeValid(String s){
        char[] arr=s.toCharArray();
        int openCount=0;
        int count=0;

        for(char c:arr){
            if(c=='('){
                openCount++;
            }else if(c==')'){
                if(openCount>0){
                    openCount--;
                }else{
                    count++;
                }
            }
        }
        return count+openCount;
    }

    public static void main(String args[]){
        String str="())";
    }
}
