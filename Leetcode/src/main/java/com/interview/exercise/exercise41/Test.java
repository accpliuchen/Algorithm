package com.interview.exercise.exercise41;

public class Test {

    // public int firstMissingPositive(int[] nums) {
    //     int n=nums.length;
    //     boolean[] temp=new boolean[n];

    //     for(int num:nums){
    //         if(num>0 && num<=n) {
    //             temp[num-1]=true;
    //         }
    //     }

    //     int i=0;

    //     for(i=0;i<n;i++){
    //         if(!temp[i]) return i+1;
    //     }

    //     return i+1;
    // }

    public int firstMissingPositive(int[] nums){
        if(nums==null || nums.length==0){
            return 1;
        }

        for(int i=0;i<nums.length;i++){
            while(nums[i]>0 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }


        return nums.length+1;
    }

    public static void main(String args[]){
        //int[] nums=new int[]{1,2,0};

        //int[] nums=new int[]{3,4,-1,1};

        int[] nums=new int[]{7,8,9,11,12};

        Test test=new Test();

        System.out.println(test.firstMissingPositive(nums));

    }

}
