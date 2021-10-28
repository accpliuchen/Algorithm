package com.interview.exercise.exercise347;

import java.util.Arrays;
import java.util.HashMap;

//https://www.cnblogs.com/xugenpeng/p/9950007.html
public class Test {

    public int[] topKFrequent(int[] nums,int k){
      int[] sol=new int[k];
      HashMap<Integer,Integer> map=new HashMap<>();

      for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
          }else{
              map.put(nums[i],1);
          }
      }

      int i=0;
      while(k>0){
        int maxKey=0;
        int max=0;

        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                maxKey=key;
            }
        }

        map.remove(maxKey);
        sol[i]=maxKey;
        i++;
        k--;

      }

      return sol;
    }

    public static void main(String args[]){
        int[] nums={1,1,1,2,2,3,4};
        int k=9;

        Test test=new Test();
        int[] result=test.topKFrequent(nums,k);

        System.out.println("result value is "+ Arrays.toString(result));

    }
}
