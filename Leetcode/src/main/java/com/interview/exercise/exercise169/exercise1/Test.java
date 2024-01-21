package com.interview.exercise.exercise169.exercise1;

public class Test {

    public int majorityElement(int[] nums){
        int candidate=0;
        int count=0;

        for(int num:nums){
            if(count==0){
                candidate=num;
                count++;
            }else if(num==candidate){
                count++;
            }else{
                count--;
            }

        }

        return candidate;
    }

    public static void main(String args[]){
//        int[] array=new int[]{3,2,3};

        int[] array=new int[]{2,2,1,1,1,2,2};

        Test test=new Test();

        int result=test.majorityElement(array);

        System.out.println("result value is "+ result);

    }
}
