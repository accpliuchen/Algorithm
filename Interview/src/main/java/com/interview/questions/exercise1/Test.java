package com.interview.questions.exercise1;

public class Test {

    public static void main(String args[]){
//        int[] nums= {2,1,2};

        int[] nums= {1,1,1,2,1,3,4};

        int size=nums.length;
        int counter=0;

        for(int i=1;i<size-1;i++){
              int x=nums[i-1];
              int y=nums[i];
              int z=nums[i+1];

              if(x!=y && y!=z && x!=z){
                  continue;
              }

              if(x==y && x==z){
                  continue;
              }

              counter+=1;
        }

        System.out.println("result value is : "+ counter);
    }
}
