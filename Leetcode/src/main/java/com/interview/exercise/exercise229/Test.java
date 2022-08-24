package com.interview.exercise.exercise229;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class Test {

	public List<Integer> majorityElement(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<nums.length;i++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i],i);
			}else{
				map.put(nums[i],map.get(nums[i])+1);
			}
		}

		List<Integer> list=new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        	if(entry.getValue()>(nums.length/3)){
        		list.add(entry.getKey());
        	}
        }

		return list;
	}

	public static void main(String args[]){
		int[] nums=new int[]{3,2,3};
	}
}
