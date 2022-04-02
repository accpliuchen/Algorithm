package com.interview.exercise.exercise198;

public class Test {

    public int rob(int[] nums){
      if(nums==null || nums.length==0) return Integer.MIN_VALUE;

      return 1;
    }


    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};


        Test test=new Test();

        int result=test.rob(nums);

        System.out.println("result value is "+ result);

    }
}
