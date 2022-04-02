package com.interview.exercise.exercise283;



public class Test {

    public void moveZeroes(int[] nums) {
        int first = 0, second = 0;
        while (second < nums.length){
            if(nums[second] != 0){
                int temp = nums[second];
                nums[first] = nums[second];
                nums[second] = nums[first];
                first++;
            }
            second++;
        }
        for (int i = first; i < nums.length; i++){
            nums[i] = 0;
        }

        System.out.println("finished");
    }

    public static void main(String args[]){
        int[] nums=new int[]{0,1,0,3,12};

        Test test=new Test();
        test.moveZeroes(nums);
    }
}
