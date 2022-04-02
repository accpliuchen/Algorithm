package com.test.interview.geeksforgeeks.exercise2;

//https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class Test {

//    public int findColorPair(int n, int[] nums) {
//        int[] colors = new int[100];
//        for (int i : nums) {
//            ++colors[i - 1];
//        }
//
//        int count = 0;
//        for (int i = 0; i < 100; i++) {
//            count += colors[i] / 2;
//        }
//
//        return count;
//    }

    public int findColorPair(int n,int[] nums){
        int f[]=new int[101],i;
        int c=0;

//filling up the frequency array

        for(i=0;i<n;i++)
            f[nums[i]]++;

//counting the total number of pairs

        for(i=1;i<=100;i++)
            c+=f[i]/2;
        return c;
    }

    public static void main(String[] args) {
        int n=7;
        int[] array={1,2,1,2,1,3,2};

        Test test=new Test();
        int result=test.findColorPair(n,array);


        System.out.println("result value is "+ result);

    }
}
