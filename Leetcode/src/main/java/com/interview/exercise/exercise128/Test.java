package com.interview.exercise.exercise128;

import java.util.HashSet;

public class Test {

    public int longestConsecutive(int[] nums){
      HashSet<Integer> set=new HashSet<>();

      for(int i=0;i<nums.length;i++){
          set.add(nums[i]);
      }

      int longSeq=0;
      int count=0;

      for(int i=0;i<nums.length;i++){
          if(!set.contains(nums[i]-1)){
              int num=nums[i]+1;
              count=1;

              while(set.contains(num)){
                  count++;
                  num+=1;
              }

              longSeq=Math.max(longSeq,count);
          }
      }

      return longSeq;
    }

    public static void main(String args[]){
        int[] array=new int[]{100,4,200,1,3,2};

        Test test=new Test();

        int result=test.longestConsecutive(array);

        System.out.println(result);
    }
}
