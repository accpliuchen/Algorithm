package com.interview.exercise.exercise1995;

import java.util.Map;
import java.util.HashMap;

public class Test {

    public int countQuadruplets(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    res+=map.getOrDefault(nums[k]-nums[j]-nums[i],0);
                }
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return res;
    }

    public static void main(String args[]){
        int[] arr=new int[]{1,1,1,3,5};

    }
}
