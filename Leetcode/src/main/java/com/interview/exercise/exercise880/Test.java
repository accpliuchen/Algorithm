package com.interview.exercise.exercise880;

public class Test {

    public String decodeAtIndex(String s,int k){

        long size=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                size*=s.charAt(i)-'0';
            }else{
                size++;
            }
        }

        for(int i=n-1;i>=0;i--){
            k=(int) (k%size);

            if(k==0 && Character.isLetter(s.charAt(i))){
                return String.valueOf(s.charAt(i));
            }

            if(Character.isDigit(s.charAt(i))){
                size/=s.charAt(i)-'0';
            }else{
                size--;
            }
        }

        return "";
    }
    public static void main(String args[]){

        String str="leet2code3";
        int k=10;

        Test test=new Test();
        String result=test.decodeAtIndex(str,k);

        System.out.println(result);
    }
}
