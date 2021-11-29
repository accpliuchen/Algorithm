package com.interview.exercise.exercise412;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public List<String> fizzBuzz(int n) {
        List<String> result=new ArrayList();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else{
                result.add(i+"");
            }
        }
        return result;
    }

    public static void main(String args[]){
        int n=15;
        Test test=new Test();
        List<String> result=test.fizzBuzz(n);

    }
}
