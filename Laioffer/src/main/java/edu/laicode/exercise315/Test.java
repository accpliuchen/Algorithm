package edu.laicode.exercise315;

import java.util.Arrays;

public class Test {

	public int[] dedup(int[] array){
        if(array.length<3){
        	return array;
        }

        int i=2;

        for(int j=2;j<array.length;j++){
        	if(array[j]==array[i-1] && array[j]==array[i-2]){
        		continue;
        	}

        	array[i++]=array[j];
        }

        return Arrays.copyOf(array,i);
	}

	public static void main(String args[]){
		int[] arrays=new int[]{1,2,2,3,3,3};

		Test test=new Test();
		int[] array=test.dedup(arrays);

		for(int i:array){
			System.out.println(i);
		}
	}
}
