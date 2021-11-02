package com.interview.exercise.exercise53;

//https://www.jianshu.com/p/3452cd9d5664
//https://blog.csdn.net/Kapo1/article/details/119245602
public class Test {

//    public int maxSubArray(int[] nums) {
//        int res = nums[0];
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        for (int j = 1; j < nums.length; j++) {
//            if (dp[j - 1] >= 0) {
//                dp[j] = dp[j - 1] + nums[j];
//            }
//            if (dp[j - 1] < 0) {
//                dp[j] = nums[j];
//            }
//            res = Math.max(res, dp[j]);
//        }
//        return res;
//    }


//    public int maxSubArray_dynamic(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return Integer.MIN_VALUE;
//        }
//
//        int[] opt = new int[nums.length];
//        opt[0] = nums[0];
//        int max = opt[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            int temp = opt[i - 1] + nums[i];
//            opt[i] = temp > nums[i] ? temp : nums[i];
//
//            if (max < opt[i]) {
//                max = opt[i];
//            }
//
//        }
//
//        return max;
//
//    }

    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE,curSum=0;

        for(int num:nums){
            curSum=Math.max(curSum+num,num);
            res=Math.max(res,curSum);
        }

        return  res;

    }


    public static void main(String args[]){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        Test test=new Test();
        int result=test.maxSubArray(nums);

        System.out.println(result);
    }
}
