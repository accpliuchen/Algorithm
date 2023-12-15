package com.interview.exercise.exercise1464;

public class Test {

    public int maxProduct(int[] nums){
        int biggest=0;
        int secondBiggest=0;

        for(int num:nums) {
            if(num>biggest){
                secondBiggest=biggest;
                biggest=num;
            }else{
                secondBiggest=Math.max(secondBiggest,num);
            }
        }

        return (biggest-1) * (secondBiggest-1);
    }


    public static void main(String args[]){
        int[] nums=new int[]{3,4,5,2};

        Test test=new Test();

        int result=test.maxProduct(nums);

        System.out.println(result);
    }
}
