package com.interview.exercise.exercise2404;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Test {

	public int mostFrequentEven(int[] nums) {
 		Map<Integer,Integer> map=new TreeMap<>();
 		//Map<Integer,Integer> map=new HashMap<>();
         
           for(int num:nums){
               if(num%2==0){
                   map.put(num,map.getOrDefault(num,0)+1);
               }
           }
        
           int result=-1;
           int count=Integer.MIN_VALUE;
        
           for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>count){
                    count=entry.getValue();
                    result=entry.getKey();
                }              
           }
        
          return result;
	}

	public static void main(String args[]){
		// int[] array=new int[]{0,1,2,2,4,4,1};
        
        int[] array=new int[]{8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};

		Test test=new Test();
		int result=test.mostFrequentEven(array);

		System.out.println("result value is "+ result);

	}
}
