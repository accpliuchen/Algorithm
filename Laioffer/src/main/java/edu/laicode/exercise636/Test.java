package edu.laicode.exercise636;

public class Test {


	public int smllestElementLargerThanTarget(int[] array,int target){
     	if(array.length==0 && array==null){
     		return -1;
     	}

     	int mid;
     	int left=0;
     	int right=array.length-1;

     	while(left<right-1){
     		mid=left+(right-left)/2;

     		if(array[mid]==target){
     			left=mid;
     		}else if(array[mid]<target){
     			left=mid;
     		}else{
     			right=mid;
     		}
     	}

     	if(array[left]>target){
     		return left;
     	}

		if(array[right]>target){
     		return right;
     	}     	

     	return -1;
	}

	public static void main(String args[]){
		int[] array=new int[]{1, 2, 2, 2, 3};
		int target=3;

		Test test=new Test();
		int result=test.smllestElementLargerThanTarget(array,target);

		System.out.println("result value is "+ result);

	}
}
