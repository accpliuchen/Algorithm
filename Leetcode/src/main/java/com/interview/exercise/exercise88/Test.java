package com.interview.exercise.exercise88;

public class Test {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m+n-1;i>=0;i--){
            if(n==0) return ;

            if(m>0 && nums1[m-1]>nums2[n-1]){
                nums1[i]=nums1[m-1];
                m--;
            }else{
                nums1[i]=nums2[n-1];
                n--;
            }
        }
    }

    public static void main(String args[]){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
    }
}
