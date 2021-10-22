package com.interview.exercise.exercise136;

import java.util.Set;
import java.util.HashSet;

public class Test {

    public int singleNumber(int[] nums){
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else{
                set.remove(nums[i]);
            }
        }

        return set.stream().findAny().orElse(null);
    }

    public static void main(String args[]){
        int[] nums = {2,2,1};

        Test test=new Test();

        System.out.println(test.singleNumber(nums));
    }
}
