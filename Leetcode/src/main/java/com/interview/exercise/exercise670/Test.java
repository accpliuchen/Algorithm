package com.interview.exercise.exercise670;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Test {

    public int maximumSwap(int num) {
        List<Integer> digits=new ArrayList<>();
        List<Integer> maxToRight=new ArrayList<>();

        int maxRight=0,maxRightPosition=0;
        int tmp=num,position=0;

        while(tmp>0){
            int digit=tmp%10;
            if(digit>maxRight){
                maxRight=digit;
                maxRightPosition=position;
            }

            maxToRight.add(maxRightPosition);
            digits.add(digit);
            tmp/=10;
            position++;

        }

        int res=0;
        boolean swapped=false;

        for(int i=digits.size()-1;i>=0;i--){
            if(!swapped){
                maxRightPosition=maxToRight.get(i);
                if(maxRightPosition<i && digits.get(maxRightPosition)>digits.get(i)){
                    Collections.swap(digits,i,maxRightPosition);
                    swapped=true;
                }
            }
            res*=10;
            res+=digits.get(i);
        }

        return res;
    }

    public static void main(String args[]){
        int num=2736;

        Test test=new Test();
        System.out.println("Result value is "+test.maximumSwap(num));

//        System.out.println(num/10);
    }
}
