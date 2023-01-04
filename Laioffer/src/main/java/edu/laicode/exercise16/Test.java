package edu.laicode.exercise16;

public class Test {

    public int lastOccur(int[] array, int target) {
        // Write your solution here
        if(array==null || array.length==0){
            return -1;
        }

        int left=0;
        int right=array.length-1;

        while(left<right-1){
            int mid=left+(right-left)/2;

            if(array[mid]==target){
                left=mid;
            }else if(array[mid]<target){
                left=mid;
            }else{
                right=mid;
            }
        }

        if(array[right]==target){
            return right;
        }

        if(array[left]==target){
            return left;
        }

        return -1;
    }
	public static void main(String args[]){
		int[] arrays=new int[]{1, 2, 2, 2, 3};
		int target=3;

		Test test=new Test();
		int result=test.lastOccur(arrays,target);
		
		System.out.println("====="+result);
	}
}
