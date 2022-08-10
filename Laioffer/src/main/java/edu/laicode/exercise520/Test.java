package edu.laicode.exercise520;

import java.util.Map;
import java.util.HashMap;

public class Test {

    public int[] intersect(int[] nums1,int[] nums2){
         if(nums1.length>nums2.length){
         	return intersect(nums2,nums1);
         }

         Map<Integer,Integer> map=new HashMap<Integer,Integer>();

         for(int val:nums1){
         	map.put(val,map.getOrDefault(val,0)+1);
         }

         int k=0;

         for(int val:nums2){
         	if(map.getOrDefault(val,0)>0){
         		nums1[k++]=val;
         		map.put(val,map.get(val)-1);
         	}
         }

         int ans[]=new int[k];

         for(int i=0;i<k;i++){
         	ans[i]=nums1[i];
         }
         
         return ans;

    }

	public static void main(String[] args) {
	  int[] nums1=new int[]{1,2,2,1};
	  int[] nums2=new int[]{2,2};	

	  Test test=new Test();
	  int[] arrays=test.intersect(nums1,nums2);

	  for(int num:arrays){
	  	System.out.println(num);

	  }
	}
}
