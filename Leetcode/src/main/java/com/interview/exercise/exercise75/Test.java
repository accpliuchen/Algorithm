package com.interview.exercise.exercise75;

public class Test {

//    public void sortColors(int[] nums) {
//        int[] count=new int[3];
//
//        for(int n:nums){
//            count[n]++;
//        }
//
//        int j=0;
//        for(int i=0;i<count.length;i++){
//            while(count[i]>0){
//                nums[j++]=i;
//                count[i]--;
//            }
//        }
//    }


    public void sortColors(int[] array) {
        if(array==null || array.length<=1){
            return;
        }

        int neg=0;
        int right= array.length-1;
        int left=0;

        while (left<=right){
            if(array[left]==0){
               swap(array,neg++,left++);
            }else if(array[left]==1){
                left++;
            }else{
                swap(array,left,right--);
            }
        }
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
