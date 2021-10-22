package com.interview.exercise.exercise287;

import java.util.Set;
import java.util.HashSet;

public class Test {

    public int findDuplicated(int[] nums){
        Set<Integer> set=new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            if(set.add(nums[i])==false){
                return nums[i];
            }
        }
        return 0;

    }

    public static void main(String args[]){
        int[] nums={1,3,4,2,2};

        Test test=new Test();
        int result=test.findDuplicated(nums);

        System.out.println("result value is "+ result);

    }
}
