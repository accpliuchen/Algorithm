package com.interview.exercise.exercise448;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();

        int[] arrays=new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            arrays[nums[i]]=1;
        }


        for(int j=1;j<arrays.length;j++){
            if(arrays[j]!=1) list.add(j);
        }

        return list;

    }

    public static void main(String args[]){
        int[]  nums = new int[]{4,3,2,7,8,2,3,1};

        Test test=new Test();

        System.out.println(test.findDisappearedNumbers(nums));

    }

}
