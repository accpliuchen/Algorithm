package com.interview.exercise.exercise326;

public class Test {

    public boolean isPowerOfThree(int n){
        if(n==1) return true;

        boolean flag=true;

        while(n>0){
            int m=n%3;
            if(m==0){
               n=n/3;
               if(n==1)
                   return true;
            }else{
                return false;
            }
        }
        return flag;
    }

    public static void main(String args[]){
        int n=27;

        Test test=new Test();
        boolean result=test.isPowerOfThree(n);
        System.out.println("result value is "+result);
    }
}
