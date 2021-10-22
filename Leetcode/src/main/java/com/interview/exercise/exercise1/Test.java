package com.interview.exercise.exercise1;

import java.util.*;

//https://www.cnblogs.com/grandyang/p/4130379.html
public class Test{

    public int[] twoSum(int[] nums,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();


        int[] res = new int[2];
        for(int i=0;i<nums.length;++i){
            if(map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]= map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return res;


    }

    public static void main(String args[]){
        Test test=new Test();

        int[] nums={2, 7, 11, 15};
        int target=9;

        System.out.print(test.twoSum(nums,target)[1]);
    }
}