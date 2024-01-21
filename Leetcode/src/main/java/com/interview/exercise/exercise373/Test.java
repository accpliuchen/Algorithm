package com.interview.exercise.exercise373;

import javafx.util.Pair;

import java.util.*;

public class Test {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m=nums1.length;
        int n=nums2.length;

        List<List<Integer>> ans=new ArrayList<>();
        Set<Pair<Integer,Integer>> visited=new HashSet<>();


        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a, b)->(a[0]-b[0])); //8,5,3
        //nums1 = [1,7,11], nums2 = [2,4,6]
        //[[(0,0)1,(0,1)7,(0,2)11]
        //[2,4,6]]
        minHeap.offer(new int[]{nums1[0]+nums2[0],0,0});
        visited.add(new Pair<Integer,Integer>(0,0));

        while(k-- >0 && !minHeap.isEmpty()){
            int[] top=minHeap.poll();
            int  i=top[1];
            int  j=top[2];

            ans.add(List.of(nums1[i],nums2[j]));

            if(i+1 <m && !visited.contains(new Pair<Integer,Integer>(i+1,j))){
                minHeap.offer(new int[]{nums1[i+1]+nums2[j],i+1,j});
                visited.add(new Pair<Integer,Integer>(i+1,j));
            }

            if(j+1 <n && !visited.contains(new Pair<Integer,Integer>(i,j+1))){
                minHeap.offer(new int[]{nums1[i]+nums2[j+1],i,j+1});
                visited.add(new Pair<Integer,Integer>(i,j+1));
            }


        }

        return ans;
    }

    public static void main(String args[]){
        int[] nums1 = new int[]{1,7,11};
        int[] nums2 = new int[]{2,4,6};
        int k = 3;

        Test test=new Test();
        test.kSmallestPairs(nums1,nums2,k);
        System.out.println("===");
    }
}
