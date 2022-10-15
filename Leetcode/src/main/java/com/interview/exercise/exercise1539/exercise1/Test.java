package com.interview.exercise.exercise1539.exercise1;

public class Test {

    public int findKthPositive(int[] arr, int k) {
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int pivot=left+(right-left)/2;

            if(arr[pivot]-pivot-1<k){
                left=pivot+1;
            }else{
                right=pivot-1;
            }
        }

        return left+k;
    }
	public static void main(String args[]){
		int[] nums=new int[]{2,3,4,7,11};
		int k=5;

        Test test=new Test();
        int result=test.findKthPositive(nums,k);

        System.out.println("result value is "+ result);
	}
}
