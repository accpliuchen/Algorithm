package com.interview.exercise.exercise209;

public class Test {

    public int minSubArrayLen(int s, int[] nums) {
        int len=nums.length;
        if(len==0)
        {
            return 0;
        }
        int left=0;
        int min=0;
        int sum=0;
        for(int right=0;right<len;right++)
        {
            sum+=nums[right];
            while(sum>=s)
            {
                min=min==0?right-left+1:Math.min(min,right-left+1);
                sum-=nums[left++];
            }
        }
        return min;
    }

    public int minSubArrayLen_new(int target,int[] nums){
        if(nums.length==0){
            return 0;
        }

        int len=nums.length, start=0;
        int sum=0,min=Integer.MAX_VALUE;

        for(int end=0;end<len;end++){
            sum+=nums[end];

            while(sum>=target){
                min=Math.min(min,end-start+1);
                sum-=nums[start++];
            }
        }


        return min== Integer.MAX_VALUE ?0:min;
    }

    public static void main(String args[]){
        int s=7;
        int[] nums={2,3,1,2,4,3};

        Test test=new Test();
        System.out.println(test.minSubArrayLen_new(s,nums));
    }
}
