package edu.laicode.exercise438;

import java.util.HashMap;

public class Test {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

      for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int pre=map.get(nums[i]);
                if(i-pre<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }

      return false;
    }

    public static void main(String args[]){
        int[] array=new int[]{1,2,3,4,5,6,7,8,8};
        int k=1;
        
        Test test=new Test();
        boolean result=test.containsNearbyDuplicate(array,k);
        
        System.out.println(result);
    }
}
