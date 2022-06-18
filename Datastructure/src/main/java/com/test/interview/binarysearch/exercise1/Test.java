package com.test.interview.binarysearch.exercise1;

public class Test {

    public int closest(int[] array,int target){
        if (array == null || array.length == 0) {
            return -1;
        }

        int lt = 0;
        int rt = array.length - 1;

        while (lt < rt - 1) {
            int mid = lt + (rt - lt) / 2;

            if (array[mid] == target) {
                return mid;
            }
            else if (array[mid] > target) {
                rt = mid;
            }
            else {
                lt = mid;
            }
        }

        if (target < array[lt]) {
            return lt;
        }
        else if (array[rt] < target) {
            return rt;
        }
        else {
            if ((target - array[lt]) < (array[rt] - target)) {
                return lt;
            }
            else {
                return rt;
            }
        }
    }

    public static void main(String args[]){
       int[] array=new int[]{1,5,7};

       Test test=new Test();
       int result=test.closest(array,6);


       System.out.println(result);
    }
}
