package edu.laicode.exercise15;

public class Test {

	public int firstOccur(int[] array,int target){
		if(array==null || array.length==0){
			return -1;
		}

		int left=0;
		int right=array.length-1;

		 while(left<right-1){
	      int mid=left+(right-left)/2;

	      if(array[mid]==target){
	        right=mid;
	      }else if(array[mid]>target){
	        right=mid;
	      }else{
	        left=mid;
	      }
	    }

	    if(array[left]==target){
	      return left;
	    } 
	    
	    if(array[right]==target){
	      return right;
	    }
	    return -1;
	}

	public static void main(String args[]){
		int[] arrays=new int[]{1, 2, 2, 2, 3};
		int target=2;

		Test test=new Test();
		int result=test.firstOccur(arrays,target);

		System.out.println("result value is "+ result);
	}
}
