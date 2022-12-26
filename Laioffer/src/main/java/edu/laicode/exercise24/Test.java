package edu.laicode.exercise24;

public class Test {

	public int totalOccurrence(int[] array, int target) {
	    // Write your solution here
	    if(array==null || array.length==0){
	      return 0;
	    }


	    int counter=0;

	    int left=0;
	    int right=array.length-1;
		while(left<=right){
	      int mid=left+(right-left)/2;

	      if(array[mid]==target){
	        counter++;
			  right=mid-1;
	      }else if(array[mid]<target){
	        left=mid+1;
	      }else{
	        right=mid-1;
	      }
	    }

	    return counter;
    }

    public static void main(String args[]){
    	int[] array=new int[]{1,2,2,2,3};
    	int target=2;
   
   		Test test=new Test();
   		int result=test.totalOccurrence(array,target);

   		System.out.println("result value is "+ result);

    }

}
