package edu.laicode.exercise14;

public class Test {

    //TC O(log n)
    //SC O(1)
	public int binarySearch(int[] array,int target){
		int left=0;
		int right=array.length-1;

        while(left<=right){
        	int mid=left+(right-left)/2;

        	if(array[mid]==target){
        		return mid;
        	}else if(array[mid]<target){
        		left++;
        	}else{
        		right--;
        	}
        }

		return -1;
	}

	public static void main(String[] args) {
	   int[] array={1,2,3,4,5};


	}
}
