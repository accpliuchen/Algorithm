package com.interview.exercise.exercise1995;

import java.util.Map;
import java.util.HashMap;

public class Test {

//    public int countQuadruplets(int[] nums) {
//        Map<Integer,Integer> map=new HashMap<>();
//        int res=0;
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                for(int k=j+1;k<nums.length;k++){
//
//                    System.out.println(nums[i]+"  "+nums[j]+" "+nums[k]);
//
//                    res+=map.getOrDefault(nums[k]-nums[j]-nums[i],0);
//                }
//            }
//            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        }
//        return res;
//    }

    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        // 每个数字小于等于100，三者之和不超过300
        int[] sum = new int[301];

        for (int c = n - 2; c >= 2; c--) {
            sum[nums[c + 1]]++;
            for (int a = 0; a < n - 3; a++) {
                for (int b = a + 1; b < c; b++) {
                    ans += sum[nums[a] + nums[b] + nums[c]];
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
//        int[] nums=new int[]{1,1,1,3,5};
        int[] nums=new int[]{1,2,3,6};


        Test test=new Test();
        int result=test.countQuadruplets(nums);

        System.out.println("result value is "+ result);
    }
}
