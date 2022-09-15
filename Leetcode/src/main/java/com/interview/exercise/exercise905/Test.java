package com.interview.exercise.exercise905;

public class Test {

	 public int[] sortArrayByParity(int[] array) {

	 	int[] sorted=new int[array.length];

	 	int start=0;
	 	int end=array.length-1;

	 	for(int num:array){
	 		if(num%2==0){
	 			sorted[start++]=num;
	 		}else{
                sorted[end--]=num;
	 		}
	 	}

	 	return sorted;
	 }

	public static void main(String args[]){
		int[] nums = new int[] {3,1,2,4};

		Test test=new Test();
		int[] array=test.sortArrayByParity(nums);

		for(int num:array){
			System.out.println(num);
		}
	}
}
