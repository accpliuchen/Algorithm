package com.interview.exercise.exercise496;

import java.util.HashMap;
import java.util.Stack;

//https://blog.csdn.net/sinat_42483341/article/details/116462221
public class Test {

    public static int[] nextGreaterElement(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();

        Stack<Integer> stack=new Stack<>();
        int cur=0;
        for(int num:nums2){
            while(!stack.isEmpty() && stack.peek()<num){
               map.put(stack.pop(),num);
            }

            stack.push(num);
        }

        int[] ret = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            Integer t = map.get(nums1[i]);
            if (t == null) ret[i] = -1;
            else ret[i] = t;
        }
        return ret;
    }


    public static void main(String args[]){

        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

        Test test=new Test();
        System.out.println(test.nextGreaterElement(nums1, nums2));
    }
}
