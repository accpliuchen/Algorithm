package edu.laicode.exercise619;

public class Test {

    public int pivotIndex(int[] array){
    	int sum=0;
    	int leftSum=0;

    	for(int nums:array){
    		sum+=nums;
    	}

    	for(int i=0;i<array.length;i++){
            if(leftSum==sum-leftSum-array[i]){
            	return i;
            }else{
               leftSum+=array[i];
            }
    	}

    	return -1;
    }

	public static void main(String args[]){
		int[] nums=new int[]{1,7,3,6,5,6};

		Test test=new Test();
		int result=test.pivotIndex(nums);

		System.out.println("result value is "+ result);
	}
}
