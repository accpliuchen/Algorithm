package com.interview.exercise.exercise1539;

public class Test {

    public int findKthPositive(int[] array,int k){

    	int n=1;
    	int th=k;

    	for(int i=0;i<array.length;++n){
    		if(array[i]==n){
    			i++;
    		}else{
    			if(--th==0)
    				return n;
    		}
    	}

    	return n+(th-1);
    }

	public static void main(String args[]){
		Test test=new Test();

		// int[] array=new int[]{1,2,3,4};
		// int target=2;

		int[] array=new int[]{2,3,4,7,11};
		int target=5;

		int result=test.findKthPositive(array,target);

		System.out.println("result value is "+ result);
	}
}
