package com.interview.exercise.exercise735;

import java.util.Stack;
import java.util.stream.IntStream;

public class Test {

    public int[] asteroidCollision(int[] asteroids){
        Stack<Integer> stack=new Stack<>();

        for(int asteroid:asteroids){

            boolean flag=true;

            while(!stack.isEmpty() && (stack.peek()>0 && asteroid<0)){

                if(Math.abs(stack.peek())<Math.abs(asteroid)){
                    stack.pop();
                    continue;
                }else if(Math.abs(stack.peek())==Math.abs(asteroid)){
                    stack.pop();
                }

                flag=false;
                break;
            }


            if(flag){
                stack.push(asteroid);
            }

        }


        int[] remaingAsteroids=new int[stack.size()];
        for(int i=remaingAsteroids.length-1;i>=0;i--){
            remaingAsteroids[i]=stack.peek();
            stack.pop();
        }

        return remaingAsteroids;
    }


    public static void main(String args[]){
        int[] asteroids=new int[]{5,10,-5};

        Test test=new Test();

        int[] nums= test.asteroidCollision(asteroids);

        IntStream.of(nums).forEach(System.out::println);
    }
}
