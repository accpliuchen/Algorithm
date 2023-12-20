package com.interview.exercise.exercise11.exercise1;

public class Test {

    public int maxArea(int[] height){
        int maxArea=0;

        int left=0;
        int right=height.length-1;

        while(left<right){
            int width=right-left;

            maxArea=Math.max(maxArea,Math.min(height[left],height[right])*width);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String args[]){
        int[] arr={1,8,6,2,5,4,8,3,7};

        Test test=new Test();

        System.out.println(test.maxArea(arr));
    }
}
