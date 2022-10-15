package edu.laicode.exercise327;

public class Test {

	public int localMinimum(int[] array) {
	   int left=0;
	   int right=array.length-1;

	   while(left<right){
	   	 int mid=left+(right-left)/2;

	   	 if(array[mid]>array[mid+1]){
	   	 	left=mid+1;
	   	 }else{
	   	 	right=mid;
	   	 }
	   }
	   return left;
	}

	public static void main(String args[]){
	   int[] arrays=new int[]{11,9,7,5,4,36,78};		
	}
}
