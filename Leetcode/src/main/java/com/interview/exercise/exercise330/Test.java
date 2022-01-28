package com.interview.exercise.exercise330;

public class Test {

//    public int minPatches(int[] nums,int n){
//        int index=0;
//        int count=0;
//        int maxConsSum=0;
//
//        while(index<nums.length && maxConsSum<n){
//            if(nums[index]>maxConsSum+1){
//                count++;
//                maxConsSum=maxConsSum+maConsuSum+1;
//            }else{
//                maxConsSum+=nums[index];
//                index++;
//            }
//        }
//
//        while(maxConsSum<n){
//            count++;
//            maxConsSum=2*maxConsSum+1;
//        }
//
//        return count;
//    }

//    public int minPatches(int[] nums, int n) {
//       long total=0;
//       int count=0;
//       int index=0;
//
//       while (total<n){
////           System.out.println(nums[index]);
//
//           if(index<nums.length && nums[index]<=total+1){
//               System.out.println(nums[index++]);
//           }else{
//               total = total + (total + 1);
//               count++;
//           }
//       }
//       return count;
//    }

    public int minPatches(int[] nums, int n) {
        int ans=0,j=0;
        long sum=0;

        while (sum<n){
            if(j< nums.length && nums[j]<=sum+1){
                sum+=nums[j++];

                System.out.println("sum+=nums[j++] value is "+ sum);
            }else{
                sum=sum*2+1;
                System.out.println("sum*2+1 value is "+ sum);
                ans++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
       int[] nums=new int[]{1,3};
       int n=6;

//        int[] nums=new int[]{1,5,10};
//        int n=20;

       Test test=new Test();
       int result=test.minPatches(nums,n);

       System.out.println("result value is "+ result);

//       int i=0;
//        System.out.println("i value is "+ i++);
    }
}
