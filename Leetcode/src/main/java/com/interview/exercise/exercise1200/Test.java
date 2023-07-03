package com.interview.exercise.exercise1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {


    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    	Arrays.sort(arr);

    	List<List<Integer>> result=new ArrayList();

    	int mid_diff=Integer.MAX_VALUE;

    	for(int i=1;i<arr.length;i++){
    		mid_diff=Math.min(arr[i]-arr[i-1],mid_diff);
    	}

    	for(int i=1;i<arr.length;i++){
    		if(arr[i]-arr[i-1]==mid_diff){
    			List<Integer> pair=new ArrayList<>();

    			pair.add(arr[i-1]);
    			pair.add(arr[i]);
    			result.add(pair);
    		}
    	}


    	return result;
    }
 
	public static void main(String args[]){
	    int[] arr=new int[]{4,2,1,3};

        Test test=new Test();

        List<List<Integer>> myList=test.minimumAbsDifference(arr);

        for (int i = 0; i < myList.size(); i++) {
 
            for (Integer str : myList.get(i)) {

            	System.out.print(str+" ");
            }
            System.out.println("");
        }

	}
}
