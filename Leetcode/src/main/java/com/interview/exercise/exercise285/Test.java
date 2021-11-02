package com.interview.exercise.exercise285;

public class Test {

//    public int addDigits(int num){
//        int sum=0;
//
//        while(num!=0){
//            sum+=num%10;
//            num/=10;
//        }
//
//        if(sum/10!=0){
//            return addDigits(sum);
//        }
//
//        return sum;
//    }

    public int addDigits(int num) {
        if (num < 10) return num;
        return addDigits(num%10 + addDigits(num/10));
    }

    public static void main(String args[]){

    }
}
