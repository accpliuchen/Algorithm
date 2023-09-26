package com.interview.exercise.exercise739;

import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Test {

    public int[] dailyTemperatures(int[] temperatures){

        int total=temperatures.length;

        int[] result=new int[total];
        Deque<Integer> stack=new ArrayDeque<>();
        
        for(int currDay=0;currDay<total;currDay++){

            int currentTemp=temperatures[currDay];
            
            while(!stack.isEmpty() && temperatures[stack.peek()]<currentTemp){
                int prevDay=stack.pop();
                result[prevDay]=currDay-prevDay;
            }

            stack.push(currDay);
        }

        return result;
    }

    public  static  void main(String args[]){
        int[]  temperatures=new int[]{73,74,75,71,69,72,76,73};

        Test test=new Test();


        System.out.println(Arrays.toString(test.dailyTemperatures(temperatures)));
    }
}
