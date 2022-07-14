package com.interview.exercise.exercise300.exercise3;

public class Test {

    public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length<1){
            return 0;
        }

        int[] M=new int[nums.length];
        M[0]=1;
        int result=1;

        for(int i=1;i<nums.length;i++){
            int curMax=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    curMax=Math.max(curMax,M[j]+1);
                }
            }
            M[i]=curMax;
            result=Math.max(result,M[i]);
        }
        return result;
    }

	public static void main(String args[]){
       //int[] array=new int[]{0,3,1,6,2,2,7};
       int[] array=new int[]{10,9,2,5,3,7,101,18};

       Test test=new Test();
       int result=test.lengthOfLIS(array);

       System.out.println("result "+ result);
	}
}
