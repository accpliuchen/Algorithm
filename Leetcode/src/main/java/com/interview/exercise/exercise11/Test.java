package com.interview.exercise.exercise11;

//https://www.youtube.com/watch?v=wLo0xIRDjQc&list=PLvyIyKZVcfAk4vxVK-QQYha7VfE4SLm9q&index=11

public class Test {


    public int maxArea(int[] height){
        int res=0;

         int l=0,r=height.length-1;

         while(l<r){
             res=Math.max(res,Math.min(height[l],height[r])*(r-l));
             if(height[l]<height[r]){
                 l++;
             }else{
                 r--;
             }
         }

         return res;
    }

    public static void main(String args[]){
        int[] arr={1,8,6,2,5,4,8,3,7};

        Test test=new Test();

        System.out.println(test.maxArea(arr));
    }
}
