package com.interview.exercise.exercise392.exercise1;

public class Test {

    public boolean isSubsequence(String s,String t){
        Integer leftBound=s.length();
        Integer rightBound=t.length();

        Integer pLeft=0;
        Integer pRight=0;

        while(pLeft<leftBound && pRight<rightBound){
            if(s.charAt(pLeft) == t.charAt(pRight)){
                pLeft+=1;
            }
            pRight+=1;
        }

        return pLeft==leftBound;
    }
    
    public static void main(String args[]){
        String s = "abc", t = "ahbgdc";

        Test test=new Test();
        boolean result=test.isSubsequence(s,t);

        System.out.println("result value is "+ result);
    }
}
