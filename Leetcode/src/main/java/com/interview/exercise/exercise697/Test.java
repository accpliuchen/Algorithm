package com.interview.exercise.exercise697;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Test {

    public static  int findShortesSubArray(int[] nums){
        HashMap<Integer,Integer> countMap=new HashMap<>();
        HashMap<Integer,Integer> leftMap=new HashMap<>();
        HashMap<Integer,Integer> rightMap=new HashMap<>();


        for(int i=0;i<nums.length;i++){
            if(leftMap.get(nums[i])==null){
                leftMap.put(nums[i],i);
            }

            rightMap.put(nums[i],i);

            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }

        int degree=Collections.max(countMap.values());

        int ans=Integer.MAX_VALUE;

        for(int key:countMap.keySet()){
            if(countMap.get(key)==degree){
                ans=Math.min(ans,rightMap.get(key)-leftMap.get(key)+1);
            }
        }

        return ans;

    }


    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,3,1};

        int result=findShortesSubArray(nums);

        System.out.println("result value is "+ result);
    }
}
