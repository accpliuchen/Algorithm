package edu.laicode.exercise115;

import java.util.*;

public class Test{

    public int[] dedup(int[] array){
    	if(array==null || array.length<=1){
    		return array;
    	}

    	int slow=0;

    	for(int fast=0;fast<array.length;fast++){
    		if(array[fast]!=array[slow]){
    			array[++slow]=array[fast];
    		}
    	}
    	return Arrays.copyOf(array,slow+1);
    }

	public static void main(String args[]){
		int[] array=new int[]{1, 2, 2, 3, 3, 3};

		Test test=new Test();
		int[] result=test.dedup(array);

		for(int arrays:result){
			System.out.println(arrays);
		}
	}
}
