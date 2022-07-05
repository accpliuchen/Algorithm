package com.interview.exercise.exercise78;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();

        if(nums==null || nums.length==0){
            return result;
        }

        List<Integer> list=new ArrayList<>();
        findSubsets(nums,0,list,result);

        return result;
    }

    public void findSubsets(int[] nums,int index,List<Integer> list,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }


        list.add(nums[index]);
        findSubsets(nums,index+1,list,result);
        list.remove(list.size()-1);
        findSubsets(nums,index+1,list,result);
    }

    public static void main(String args[]){
        int[]  array=new int[]{1,2,3};

        Test test=new Test();

        List<List<Integer>>  result=test.subsets(array);

        System.out.println(result.size());
    }
}
