package com.interview.exercise.exercise66;

public class Test {

    public int[] plusOne(int[] digits) {

//        int carry=1;
//        for(int i=digits.length-1;i>=0;i--){
//            int sum=digits[i]+carry;
//            digits[i]=sum%10;
//            carry=sum/10;
//            if(carry==0) return digits;
//        }
//
//        int nums[]=new int[digits.length+1];
//        nums[0]=1;
//        return nums;


        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }


    public static void main(String args[]){
//        int[] digits={4,3,2,1};

        int[] digits={9};

        Test test=new Test();
        int[] result=test.plusOne(digits);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}
