package com.interview.exercise.exercise696;

public class Test {

    public int countBinarySubString(String s){
        int cur=1;
        int pre=0;
        int res=0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }else{
                res+=Math.min(cur,pre);
                pre=cur;
                cur=1;
            }
        }

        return res+Math.min(cur,pre);
    }

    public static void main(String args[]){
        //String str="10101";
        String str="00110011";
        Test test=new Test();

        int result=test.countBinarySubString(str);

        System.out.println(result);
    }
}
