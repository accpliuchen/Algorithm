package com.interview.exercise.exercise1800;

public class Test {

    public int maxAscendingSum(int[] nums) {
        if(nums.length==0){
            return 0;
        }

//        int[] result=new int[nums.length+1];
//        result[0]=nums[0];
//        int cur=nums[0];
//
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]>nums[i-1]){
//                cur=Math.max(cur,nums[i]+result[i-1]);
//                result[i]=Math.max(cur,nums[i]);
//            }else{
//                result[i]=nums[i];
//                cur=0;
//            }
//        }
//
//        return result[nums.length-1];

        int res=nums[0];
        int temp=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                temp+=nums[i];
            }else{
                temp=nums[i];
            }
            res=Math.max(res,temp);
        }

        return res;
    }

    public static void  main(String args[]){
        int[] array=new int[]{10,20,30,5,10,50};

        Test test=new Test();
        int result=test.maxAscendingSum(array);

        System.out.println(result);
    }
}
