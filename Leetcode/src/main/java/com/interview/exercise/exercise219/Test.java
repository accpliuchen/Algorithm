package com.interview.exercise.exercise219;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public boolean containsNearbyDuplicate(int[] nums,int k){
		if(k==0) return false;

		Map<Integer,Integer> hashMap=new HashMap<>();
		
		for(int i=0;i<nums.length;i++){
			int integer=nums[i];
			if(hashMap.containsKey(integer) && i-hashMap.get(integer)<=k)
				return true;
			hashMap.put(integer,i);
		}

		return false;
	}

	public static void main(String args[]){
//		int[] nums=new int[]{1,2,3,1,2,3};
//		int k=2;

		int[] nums=new int[]{1,2,3,1};
		int k=3;
		Test test=new Test();
		boolean result=test.containsNearbyDuplicate(nums,k);

		System.out.println("result value is "+ result);
	}
}
