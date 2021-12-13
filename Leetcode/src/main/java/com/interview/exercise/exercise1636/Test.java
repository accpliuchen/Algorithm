package com.interview.exercise.exercise1636;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//https://www.acwing.com/solution/content/24098/
//https://www.cxyzjd.com/article/qq_30653631/115638517
//https://blog.csdn.net/Fitz1318/article/details/109529907

public class Test {

//    public int[] frequencySort(int[] nums) {
//        int[] tmp=new int[201];
//        for(int n:nums){
//            tmp[n+100]++;
//        }
//
//        for(int i=0;i<nums.length;i++){
//
////            System.out.println(nums[i]+100);
////            System.out.println(tmp[nums[i]+100]);
////            System.out.println(tmp[nums[i]+100]*1000);
//
//            nums[i]=tmp[nums[i]+100]*1000-nums[i]+100;
//        }
//
//        Arrays.sort(nums);
//
//        for(int i=0;i<nums.length;i++){
//
//            System.out.println(nums[i]%1000);
//
//            nums[i]=100-nums[i]%1000;
//        }
//        return nums;
//    }

    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < n;i ++)
        {
            int x = nums[i];
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Integer[] num = new Integer[n];
        for(int i = 0;i < n;i ++) num[i] = nums[i];

        Arrays.sort(num,(x, y) ->{
            if(map.get(x) < map.get(y)) return -1;
            else if(map.get(x) == map.get(y)) return y-x;
            else return 1;
        });

        for(int i = 0;i < n;i ++) nums[i] = num[i];

        return nums;
    }


    public static void main(String args[]){
        int[] array=new int[]{1,1,2,2,2,3};


        //System.out.println(2%1000);
        Test test=new Test();

        System.out.println("Result value is: "+test.frequencySort(array).toString());



    }
}
