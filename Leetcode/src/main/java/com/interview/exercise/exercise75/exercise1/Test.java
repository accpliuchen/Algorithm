package com.interview.exercise.exercise75.exercise1;

public class Test {

    public int[] sortColors(int[] array) {
        if(array==null || array.length<=1){
            return array;
        }

        int neg=0;
        int right= array.length-1;
        int left=0;

        while (left<=right){
            if(array[left]==0){
                swap(array,neg++,left++);
            }else if(array[left]==1){
                left++;
            }else if(array[left]==2){
                right--;
                swap(array,left,right);

            }else{
                swap(array,left,right--);
            }
        }

        return array;
    }


    private void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String args[]){
        int[] num={2,0,2,1,1,0};

        Test test=new Test();
        test.sortColors(num);
    }
}
