package com.interview.exercise.exercise307;

class NumArray {

    int[] arr;
    public NumArray(int[] nums) {
        this.arr=nums;
    }

    public void update(int index, int val) {
        for(int i=0;i<arr.length;i++){
            if(i==index){
                arr[i]=val;
            }
        }
    }

    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array=new int[]{1, 3, 5};
        NumArray numArray = new NumArray(array);
        int result=numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9

        System.out.println("result value is "+ result);

        numArray.update(1, 2);   // nums = [1, 2, 5]
        result=numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
        System.out.println("result value is "+ result);
    }
}
