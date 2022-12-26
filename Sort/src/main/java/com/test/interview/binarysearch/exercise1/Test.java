package com.test.interview.binarysearch.exercise1;

public class Test {

	public int BinarySearch(int[] array){
		if(array==null || array.length==0){
			return -1;
		}

		int mid;
		int left=0;
		int right=array.length-1;

		while(left<right-1){
			mid=left+(right-left)/2;

			if(array[mid-1]<array[mid] && array[mid]>array[mid+1]){
				return mid;
			} else if(array[mid-1]<array[mid]){
				left=mid;
			}else{
				right=mid;
			}
		}

		if(array[left]>array[right])
			return left;

		return right;
	}

	public static void main(String args[]){
		int[] array=new int[]{1,2,4,5,4,2};

		Test test=new Test();
		int result=test.BinarySearch(array);

		System.out.println("result value is "+ result);
	}
}
