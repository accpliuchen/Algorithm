package com.test.interview.rainbowsort;

public class Test {

   public int[] rainbowSort(int[] array){
       if(array==null || array.length<=1){
           return array;
       }

       int neg=0;
       int left=0;
       int right=array.length-1;

       while(left<=right){
           if(array[left]==-1){
               swap(array,neg++,left++);
           }else if(array[left]==0){
               left++;
           }else{
               swap(array,left,right--);
           }
       }
       return array;
   }

   private void swap(int[] array,int a,int b){
       int temp=array[a];
       array[a]=array[b];
       array[b]=temp;
   }


    public static void main(String args[]){
//        int[] array=new int[]{1,0};

        int[] array=new int[]{1,0,1,-1,0};

        Test test=new Test();
        int[] result=test.rainbowSort(array);

        for(int res:result) {
            System.out.println("result is "+ res);
        }

    }
}
