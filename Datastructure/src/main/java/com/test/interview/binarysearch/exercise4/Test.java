package com.test.interview.binarysearch.exercise4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Test {

	public int[] kClosest(int[] array, int target, int k){
		if(array==null || array.length==0){
			return new int[0];
		}

		if(k==0){
			return new int[0];
		}

		int left=closest(array,target);
		int right=left+1;

		int[] result=new int[k];

		for(int i=0;i<k;i++){
			if(right>=array.length || left>=0 && Math.abs(array[left]-target)<= Math.abs(array[right]-target)){
				result[i]=array[left--];
			}else{
				result[i]=array[right++];
			}
		}

		return  result;
	}

	public int closest(int[] array,int target){
   	if(array==null || array.length==0){
   		return -1;
   	}

   	int left=0;
   	int right=array.length-1;

       while(left<right-1){
       	int mid=left+(right-left)/2;

       	if(array[mid]==target){
       		return mid;
       	}else if(array[mid]<target){
       		left=mid;
       	}else{
       		right=mid;
       	}
       }

       if(Math.abs(array[left]-target)<= Math.abs(array[right]-target)){
       	return left;
       }
		return right;
   }

	public static void main(String args[]){
	    //int[] array=new int[]{3,5,9,11};
		//int target=10;
		//int k=3;

//		int[] array=new int[]{1,4,6,8};
//		int target=3;
//		int k=3;

		int[] array=new int[]{1,5};
		int target=10;
		int k=2;

		// int[] array=new int[]{1,5};
		// int target=10;
		// int k=2;

		Test test=new Test();

		int[] result=test.kClosest(array,target,k);

       for(int num:result){
			System.out.println("result value is "+ num);
		}
	}
}
