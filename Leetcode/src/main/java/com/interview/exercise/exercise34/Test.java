package com.interview.exercise.exercise34;

public class Test {

    public int[] searchRange(int[] nums, int target) {
       int[] arr={-1,-1};
       int start=0;
       int end=nums.length-1;
       int index=-1;

       while(start<=end){
           int mid=(start+end)/2;

           if(target<nums[mid]){
               end=mid-1;
           }else if(target>nums[mid]){
               start=mid+1;
           }else{
               index=mid;
               break;
           }
       }

       if(index==-1){
           return arr;
       }

       int i=index,j=index;
       while(i>=1 && nums[i-1]==target){
           i--;
       }

       while(j+1<=nums.length-1 && nums[j+1]==target){
           j++;
       }

       arr[0]=i;
       arr[1]=j;

       return arr;
    }

    public int[] searchRange_recursive(int[] nums, int target) {
        int[] temp=new int[2];
        temp[0]=-1;
        temp[1]=-1;

        int start=findPosition(nums,target,true);
        int end=findPosition(nums,target,false);

        temp[0]=start;
        temp[1]=end;

        return temp;

    }

    public static int findPosition(int[] a, int k, boolean run){
         int start=0;
         int end=a.length-1;
         int result=-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(a[mid] > k){
                end = mid-1;
            }else if(a[mid] < k){
                start = mid+1;
            }else {
                result = mid;
                //store the mid in result variable becoz this is our possible ans not real answer so just store that ans in case there will be only 1 element in whole array
                //if our boolean value for run is true just make binary end to mid-1
                //and for false make start = mid+1
                if (run) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            return result;
    }


    public static void main(String args[]){
       int[] nums={5,7,7,8,8,10};
       int target=10;

       Test test=new Test();
       int[] result=test.searchRange(nums,target);

       System.out.println(result[0]);
       System.out.println(result[1]);

    }
}
