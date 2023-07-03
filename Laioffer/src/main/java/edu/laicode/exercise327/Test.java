package edu.laicode.exercise327;

public class Test {
     //The lastest 
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
//	   int[] arrays=new int[]{7,8,10,15,20,9};

//		int[] arrays=new int[]{1,2,1,3,5,6,4};
	   int[] arrays=new int[]{11,9,7,5,4,36,78};
		
	   Test test=new Test();

	   int result=test.localMinimum(arrays);

	   System.out.println(result);

	}
}
