package edu.laicode.exercise10.test1;

public class Test {

       public int[] quickSort(int[] array) {
        // Write your solution here
        if(array==null || array.length==0){
          return array;
        }
        quickSort(array,0,array.length-1);
        return array;
      }

      private void quickSort(int[] array,int left,int right){
        if(left>right){
          return;
        }

        int pivot=partition(array,left,right);

        quickSort(array,left,pivot-1);
        quickSort(array,pivot+1,right);
      }

      private int partition(int[] array,int left,int right){
        int mid=left+(right-left)/2;

        int leftBound=left;
        int rightBound=right-1;

        swap(array,mid,right);

        while(leftBound<=rightBound){
          if(array[leftBound]<array[right]){
            leftBound++;
          }else if(array[rightBound]>array[right]){
            rightBound--;
          }else{
            swap(array,leftBound++,rightBound--);
          }

        }

        swap(array,leftBound,right);

        return leftBound;
      }

      private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
      }


    public static void main(String args[]){
        int[] array=new int[]{4,2,-3,6,1};

        Test test=new Test();
        test.quickSort(array);

        for(int nums:array){
            System.out.println(nums);
        }
    }
}
