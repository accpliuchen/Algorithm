package com.test.interview.basic.exercise2;

public class Test {

    public void partition(int[] array,int privotIndex){

         if(array==null || array.length<=1){
             return ;
         }

         swap(array,privotIndex,array.length-1);

         System.out.print("Before");
         print(array);

         int i=0;
         int j=array.length-2;

         while(i<=j){
             if(array[i]>array[array.length-1]){
                 swap(array,i,j);
                 --j;
             }else{
                 ++i;
             }
         }
         swap(array,i,array.length-1);

         System.out.print("After");
         print(array);
    }

    private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    private void print(int[] array){
        for(int element : array){
            System.out.print(element+" ");
        }
    }

    public static void main(String args[]){
        int[] array=new int[]{9,4,6,2,0,1,7};

        Test test=new Test();
        test.partition(array,2);
    }
}
