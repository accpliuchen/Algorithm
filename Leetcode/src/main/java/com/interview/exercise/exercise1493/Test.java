package com.interview.exercise.exercise1493;

public class Test {

	public int longestSubarray(int[] nums){
		int zeroCount=0;
		int longestWindows=0;

		int start=0;

		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				zeroCount+=1;
			}else{
				zeroCount-=0;
			}

			while(zeroCount>1){
				if(nums[start]==0){
					zeroCount-=1;
				}else{
					zeroCount-=0;
				}
				start++;
			}

			longestWindows=Math.max(longestWindows,i-start);
		}

		return longestWindows;
	}

	public static void main(String args[]){
		//int[] nums = new int[]{1,1,0,1};

		int[] nums = new int[]{0,1,1,1,0,1,1,0,1};
		Test test=new Test();

		int result=test.longestSubarray(nums);


		System.out.println(result);

	}
}
