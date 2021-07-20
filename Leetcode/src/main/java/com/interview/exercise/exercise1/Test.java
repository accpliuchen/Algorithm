package com.interview.exercise.exercise1;

import java.util.*;

//https://www.cnblogs.com/grandyang/p/4130379.html
public class Test{

    public int[] twoSum(int[] nums,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();


        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int t = target - nums[i];
            if (map.containsKey(t) && map.get(t) != i) {
                res[0] = i;
                res[1] = map.get(t);
                break;
            }
        }
        return res;


    }

    public static void main(String args[]){

    }
}