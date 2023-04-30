package edu.laicode.exercise69;

public class Test {

	public int missing(int[] array){
    	int n = array.length;
		int left = 0;

		int right = n;
		while(left < right){
			int mid = left + (right - left)/2;
		
			if(array[mid] == mid + 1){//left side ok
				left = mid + 1;
			}else{
				right = mid;
			}
		}
		return left + 1;

	}

	public static void main(String args[]){
		int[] array = new int[]{1,2,4};

		Test test=new Test();

		int result=test.missing(array);

		System.out.println(result);

	}
}
