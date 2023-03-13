package com.interview.exercise.exercise18;

import java.util.*;


public class Test {

    static class Pair{
        int left;
        int right;

        public Pair(int left,int right){
            this.left=left;
            this.right=right;
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();

        if(nums==null || nums.length<4){
            return result;
        }

        List<Integer> current=new ArrayList<>();

        Map<Integer,Pair> map=new HashMap<>();
        Set<List<Integer>> s=new HashSet<>();

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                int sum=nums[i]+nums[j];

                if(map.containsKey(target-sum) && map.get(target-sum).right<j){
                    Pair pair=map.get(target-sum);
                    current.add(nums[pair.left]);

                    current.add(nums[i]);
                    current.add(nums[j]);


                    current.add(nums[pair.right]);

                    result.add(current);

                    if(!s.contains(current)) {
                        s.add(current);
                    }
                    System.out.println("===");
                }

                if(!map.containsKey(sum)){
                    map.put(sum,new Pair(j,i));
                }
            }

        }


        return result;
    }

    public static void main(String args[]){
       int[] nums={2,2,2,2,2};
       int target=8;

       Test test=new Test();
       List<List<Integer>> result=test.fourSum(nums,target);

       System.out.println(result.isEmpty());
    }
}
