package com.interview.exercise.exercise560;

import java.util.Map;
import java.util.HashMap;

public class Test {


    public int subarraySum(int[] nums,int k){
        int count=0;
        int sum=0;

        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }

    public static void main(String args[]){
        int[] nums=new int[]{1,2,3};
        int k=3;

        Test test=new Test();

        int result=test.subarraySum(nums,k);

        System.out.println(result);

    }
}
