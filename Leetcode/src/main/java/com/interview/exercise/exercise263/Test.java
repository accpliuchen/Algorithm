package com.interview.exercise.exercise263;

public class Test {

    public boolean isUgly(int n){
        if(n<=0)
            return false;

        while(n>1){
            if(n%2==0)
                n/=2;
            else if(n%3==0)
                n/=3;
            else if(n%5==0)
                n/=5;
            else
                return false;
        }
        return true;
    }

    public static void main(String args[]){
        int a=6;

        Test test=new Test();

        boolean result=test.isUgly(8);

        System.out.println("result value is "+ result);
    }
}
