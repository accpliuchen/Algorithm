package com.interview.exercise.exercise1784;

public class Test {
    public boolean checkOnesSegment(String s) {
        int count=0;
        boolean flag=false;

        while(count<s.length()){

            while(count<s.length() && s.charAt(count)=='1'){
                count++;
                if(flag){
                    return false;
                }
            }
            flag=true;
            count++;
        }
        return flag;
    }

    public static void main(String args[]){
         String str="1100";

         Test test=new Test();
         boolean result=test.checkOnesSegment(str);

         System.out.println("result value is "+ result);

    }
}
