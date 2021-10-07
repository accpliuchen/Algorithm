package com.interview.exercise.exercise485;

public class Test {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }
        return Math.max(max,count);
    }


    public static void main(String args[]){
        int[] nums=new int[]{1,1,0,1,1,1};

        Test test=new  Test();
        int result=test.findMaxConsecutiveOnes(nums);

        System.out.println(result);
    }
}
