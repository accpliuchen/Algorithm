package com.interview.exercise.exercise686;

import java.util.Deque;
import java.util.ArrayDeque;

public class Test {

    public int[] removeDuplicate(int[] array, int duplicate) {
        // Write your solution here

        if(array==null || array.length==0){
            return array;
        }

        Deque<Integer> stack=new ArrayDeque<>();

        for(int i=0;i<array.length;i++){
            if(array[i]!=duplicate){
                stack.offer(array[i]);
            }
        }

        int[] nums=new int[stack.size()];
        int i=0;
        while(!stack.isEmpty()){
            nums[i++]=stack.pop();
        }
        return nums;
    }
    
}
