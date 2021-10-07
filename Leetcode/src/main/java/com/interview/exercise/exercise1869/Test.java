package com.interview.exercise.exercise1869;

public class Test {

    public boolean checkZeroOnes(String s) {
        int max_1=0;
        int max_0=0;

        int cur1=0;
        int cur0=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                cur0++;
                cur1=0;
                max_0=Math.max(max_0,cur0);
            }else{
                cur1++;
                cur0=0;
                max_1=Math.max(max_1,cur1);
            }
        }

        return max_1>max_0;
    }

    public static void main(String args[]){
        String str="111000";

        Test test=new Test();
        boolean result=test.checkZeroOnes(str);

        System.out.println("result value is "+result);
    }
}
