package com.interview.hopper;

//        H0 aaa
//        H1 bbb
//        H2 ccc
//        H1 ddd
//        H2 eee
//        让你建⽴⼀个数据结构 变成
//        H0 aaa
//        |----H1 bbb
//        | |---- H2 ccc
//        |----H1 ddd
//        |---- H2 eee

import java.util.Arrays;

public class Test {

    public static void main(String args[]){
        int[] nums = new int[]{3,2,3};
        Arrays.sort(nums);
       int result=nums[nums.length/2];

       System.out.println(result);
    }
}
