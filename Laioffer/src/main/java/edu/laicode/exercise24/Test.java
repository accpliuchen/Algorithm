package edu.laicode.exercise24;

public class Test {

//	public int totalOccurrence(int[] array, int target) {
//	    // Write your solution here
//	    if(array==null || array.length==0){
//	      return 0;
//	    }
//
//
//	    int counter=0;
//
//	    int left=0;
//	    int right=array.length-1;
//		while(left<=right){
//	      int mid=left+(right-left)/2;
//
//	      if(array[mid]==target){
//	        counter++;
//			  right=mid-1;
//	      }else if(array[mid]<target){
//	        left=mid+1;
//	      }else{
//	        right=mid-1;
//	      }
//	    }
//
//	    return counter;
//    }


	public int totalOccurrence(int[] array, int target) {
		// Write your solution here

		if (array == null || array.length == 0) {
			return 0;
		}
		int start = 0, end = array.length - 1, head = 0, tail = 0;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (array[mid] >= target) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (array[start] == target) {
			head = start;
		} else if (array[end] == target) {
			head = end;
		} else {
			return 0;
		}
		start = 0; end = array.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (array[mid] <= target) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (array[end] == target) {
			tail = end;
		} else if (array[start] == target) {
			tail = start;
		}
		return tail - head + 1;
	}

    public static void main(String args[]){
    	int[] array=new int[]{1,2,2,2,3};
    	int target=2;
   
   		Test test=new Test();
   		int result=test.totalOccurrence(array,target);

   		System.out.println("result value is "+ result);

    }

}
