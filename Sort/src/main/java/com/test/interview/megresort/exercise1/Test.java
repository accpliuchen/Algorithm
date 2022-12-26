package com.test.interview.megresort.exercise1;

public class Test {

    public int[] mergeSort(int[] array){
    	if(array==null){
    		return array;
    	}

    	int[] helper=new int[array.length];
    	mergeSort(array,helper,0,array.length-1);
    	
    	return array;
    }

    private void mergeSort(int[] array,int[] helper, int left,int right){
    	if(left>=right){
    		return ;
    	}

    	int mid=left+(right-left)/2;

    	mergeSort(array,helper,left,mid);
    	mergeSort(array,helper,mid+1,right);

    	//merge(array,helper,left,mid,right);
    }

//    private void merge(int[] array,int[] helper,int left, int mid,int right){
//    	for(int i=left;i<=right;i++){
//    		helper[i]=array[i];
//    	}
//
//    	int left=left;
//    	int rightIndex=mid;
//
//    	while(leftIndex<=mid && rightIndex<=right){
//    		if(helper[leftIndex]<=helper[rightIndex]){
//    			array[left++]=helper[leftIndex++];
//    		}else{
//    			array[left++]=helper[rightIndex++];
//    		}
//    	}
//
//    	while(leftIndex<=mid){
//    		array[left++]=helper[leftIndex++];
//    	}
//    }

	public static void main(String args[]){
		int[] array=new int[]{1,2,3};

		Test test=new Test();

	}
}
