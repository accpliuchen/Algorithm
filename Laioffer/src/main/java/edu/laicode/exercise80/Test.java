package edu.laicode.exercise80;

import java.util.ArrayList;

public class Test {

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){

            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }


    public static void main(String args[]){
        int[] nums = new int[]{0,1,2,3,4};
        int[] index = new int[]{0,1,2,2,1};


        Test test=new Test();

        int[] result=test.createTargetArray(nums,index);


        for(int rs:result){
            System.out.print(rs);
        }

    }
}
