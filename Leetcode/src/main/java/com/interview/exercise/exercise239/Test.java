package com.interview.exercise.exercise239;

import java.util.LinkedList;

//https://www.cnblogs.com/huansky/p/13488234.html
public class Test {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int right=0;
        int[] res=new int[nums.length-k+1];
        int index=0;

        LinkedList<Integer> list = new LinkedList<>();

        while (right<nums.length){
            while(!list.isEmpty() && nums[right]>list.peekLast()){
                list.removeLast();
            }

            list.addLast(nums[right]);
            right++;

            if(right>=k){
                res[index++]=list.peekFirst();

                if(list.peekFirst()==nums[right-k]){
                    list.removeFirst();
                }
            }
        }
        return res;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static  void main(String args[]){
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;

        Test test=new Test();
        int[] result=test.maxSlidingWindow(nums,k);

        printArray(result);
    }
}
