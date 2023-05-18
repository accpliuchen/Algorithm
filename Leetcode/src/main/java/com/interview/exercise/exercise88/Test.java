package com.interview.exercise.exercise88;

public class Test {

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for(int i=m+n-1;i>=0;i--){
//            if(n==0) return ;
//
//            if(m>0 && nums1[m-1]>nums2[n-1]){
//                nums1[i]=nums1[m-1];
//                m--;
//            }else{
//                nums1[i]=nums2[n-1];
//                n--;
//            }
//        }
//    }

//    public void merge(int[] nums1,int m,int[] nums2,int n){
//        int i=m-1;
//        int j=n-1;
//        int k=m+n-1;
//
//        while(i>=0 && j>=0){
//            if(nums1[i]<nums2[j]){
//                nums1[k--]=nums2[j--];
//            }else{
//                nums1[k--]=nums1[i--];
//            }
//        }
//
////        for(int p=0;p<nums1.length;p++){
////            System.out.println(nums1[p]);
////        }
//
//        while(j>=0){
//            nums1[k--]=nums2[j--];
//        }
//
//        for(int p=0;p<nums1.length;p++){
//            System.out.println(nums1[p]);
//        }
//    }

    public int[] merge(int[] A, int m, int[] B, int n) {
        // Write your solution here

        int first=m-1;
        int second=n-1;
        int total=m+n-1;

        while(first>=0 && second>=0){
            if(A[first]<B[second]){
                A[total--]=B[second--];
            }else{
                A[total--]=A[first--];
            }
        }

        while(second>=0){
            A[total--]=B[second--];
        }

        return A;
    }


    public static void main(String args[]){
//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = new int[]{2,5,6};
//        int n = 3;

        int[] nums1 = new int[]{};
        int m = 0;
        int[] nums2 = new int[]{1,2,3,4};
        int n = 4;

//        int[] nums1 = new int[]{0};
//        int m = 0;
//        int[] nums2 = new int[]{1};
//        int n = 1;

        Test test=new Test();
        test.merge(nums1,m,nums2,n);

        System.out.println("===");

    }
}
