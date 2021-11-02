package com.interview.exercise.exercise75;

public class Test {

    public void sortColors(int[] nums) {
        int[] count=new int[3];

        for(int n:nums){
            count[n]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j++]=i;
                count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int[] num={2,0,2,1,1,0};

        Test test=new Test();
        test.sortColors(num);
    }
}
