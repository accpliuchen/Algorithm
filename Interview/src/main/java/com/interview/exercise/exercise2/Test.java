package com.interview.exercise.exercise2;

public class Test {

    public int getSecondSmallest(int[] array){

        int temp;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        return array[1];
    }

    public static void main(String[] args) {
        int b[]={44,66,99,77,33,22,55};
        Test test=new Test();
        int result=test.getSecondSmallest(b);

        System.out.println("result value is "+ result);
    }
}
