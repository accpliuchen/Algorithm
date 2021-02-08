package com.test.interview.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class Test {

    public static  void main(String args[]){

        int[] array={2,7,11,15,3,6};

        int[] result=twoSum(array,9);

        //System.out.println(Arrays.toString(result));

        printArray(result);
    }

    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }

//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int sub=target-nums[i];
//            if(map.containsKey(sub)){
//                return new int[]{i,map.get(sub)};
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    private static void printArray(int[] arrays){
        for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
    }
}
