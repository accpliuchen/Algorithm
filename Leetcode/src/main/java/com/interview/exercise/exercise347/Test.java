package com.interview.exercise.exercise347;

import java.util.*;

//https://www.cnblogs.com/xugenpeng/p/9950007.html
public class Test {

//    public int[] topKFrequent(int[] nums,int k){
//      int[] sol=new int[k];
//      HashMap<Integer,Integer> map=new HashMap<>();
//
//      for(int i=0;i<nums.length;i++){
//          if(map.containsKey(nums[i])){
//              map.put(nums[i],map.get(nums[i])+1);
//          }else{
//              map.put(nums[i],1);
//          }
//      }
//
//      int i=0;
//      while(k>0){
//        int maxKey=0;
//        int max=0;
//
//        for(Integer key:map.keySet()){
//            if(map.get(key)>max){
//                max=map.get(key);
//                maxKey=key;
//            }
//        }
//
//        map.remove(maxKey);
//        sol[i]=maxKey;
//        i++;
//        k--;
//
//      }
//
//      return sol;
//    }


    public int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }

        // 1. Build hash map: character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap();
        for (int n: nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> count.get(n1) - count.get(n2));

        // 2. Keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: count.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }

        // 3. Build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
    public static void main(String args[]){
        int[] nums={1,1,1,2,2,3};
        int k=2;

        Test test=new Test();
        int[] result=test.topKFrequent(nums,k);

        System.out.println("result value is "+ Arrays.toString(result));

    }
}
