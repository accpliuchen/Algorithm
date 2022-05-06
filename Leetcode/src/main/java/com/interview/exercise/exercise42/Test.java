package com.interview.exercise.exercise42;

public class Test {

    public int trap(int[] height){
        int result=0;

        int leftMaxNum=0,rightMaxNum=0;

        int low=0,high=height.length-1;
        while(low<=high){
            if(height[low]<height[high]){
                if(height[low]>leftMaxNum) leftMaxNum=height[low];
                else result+=leftMaxNum-height[low];
                low++;
            }else{
                if(height[high]>rightMaxNum) rightMaxNum=height[high];
                else result+=rightMaxNum-height[high];
                high--;
            }
        }

        return result;
    }

    public static void main(String args[]){
        int[] height = new int[]{4,2,0,3,2,5};

        Test test=new Test();
        int result=test.trap(height);

        System.out.println("result value is "+ result);
    }
}
