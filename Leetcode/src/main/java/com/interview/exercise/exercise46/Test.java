package com.interview.exercise.exercise46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/permutations/
//https://blog.csdn.net/zxzxzx0119/article/details/81452269
//https://www.jiuzhang.com/solution/permutations/

//https://blog.csdn.net/zxzxzx0119/article/details/81452269
public class Test {


//    public List<List<Integer>> permute(int[] nums){
//        List<List<Integer>> result=new ArrayList<List<Integer>>();
//        permute(nums,result,0);
//        return result;
//    }
//
//    public void permute(int[] nums,List<List<Integer>> result,int start){
//        if(start>=nums.length){
//            List<Integer> list=new ArrayList<Integer>();
//            for(Integer n:nums){
//                list.add(n);
//            }
//            result.add(list);
//        }
//
//        for(int i=start;i<nums.length;i++){
//            swap(nums,start,i);
//            permute(nums,result,start+1);
//            swap(nums,start,i);
//        }
//    }
//
//
//    public static void swap(int[] nums,int left,int right){
//        int temp=nums[left];
//        nums[left]=nums[right];
//        nums[right]=temp;
//    }

//    public List<List<Integer>> permute(int[] nums){
//        List<List<Integer>> result=new ArrayList<>();
//        List<Integer> origlist=new ArrayList();
//
//        for(int i=0;i<nums.length;i++){
//            origlist.add(nums[i]);
//        }
//
//        permute(origlist, 0, result);
//        return result;
//    }
//
//    public void permute(List<Integer> list, int start, List<List<Integer>> result){
//        if(start==list.size()-1){
//            result.add(new ArrayList<Integer>(list));
//            return;
//        }
//
//        for (int i = start; i < list.size(); i++){
//
//            Collections.swap(list, start, i);
//            permute(list, start+1, result);
//            Collections.swap(list, start, i);
//
//        }
//    }


//    public List<List<Integer>> permute(int[] nums){
//        List<List<Integer>> res=new ArrayList<>();
//        dfs(res,nums,0);
//        return res;
//    }
//
//    public void dfs(List<List<Integer>> res,int[] nums, int cur){
//        if(cur==nums.length){
//            List<Integer> temp=new ArrayList<>();
//            for(Integer item:nums){
//                temp.add(item);
//            }
//            res.add(temp);
//
//        }else{
//            for(int i=cur;i<nums.length;i++){
//                swap(nums,cur,i);
//                dfs(res,nums,cur+1);
//                swap(nums,cur,i);
//            }
//        }
//    }
//
//    private void swap(int[] arr,int a,int b){
//        int temp=arr[a];
//        arr[a]=arr[b];
//        arr[b]=temp;
//    }


//    public List<List<Integer>> permute(int[] nums){
//        List<List<Integer>> res=new ArrayList<>();
//        List<Integer> first=new ArrayList<>();
//
//        if(nums.length==0 || nums==null)
//            return res;
//
//        first.add(nums[0]);
//        res.add(first);
//
//        List<List<Integer>> newRes;
//        for(int i=1;i<nums.length;i++){
//            newRes=new ArrayList<>();
//            for(List<Integer> item:res){
//
//                System.out.println("item.size value is "+ item.size());
//
//                for(int j=0;j<=item.size();j++){
//                    List<Integer> temp=new ArrayList<>(item);
//
//                    System.out.println("j value is "+j +" nums i "+i+" value is "+nums[i]);
//                    temp.add(j,nums[i]);
//                    newRes.add(temp);
//                }
//            }
//            res=newRes;
//        }
//        return res;
//    }

    public List<List<Integer>> permute(int[] nums){
        LinkedList<List<Integer>> res=new LinkedList<List<Integer>>();
        res.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            int size=res.size();
            for(;size>0;size--){
                List<Integer> item=res.pollFirst();

                //System.out.println("pollFirst value size is "+ item.size());
                for(int j=0;j<=item.size();j++){


//                    System.out.println("j value is "+ j);

                    List<Integer> temp=new ArrayList<>(item);

                    System.out.println("temp nums[i] "+i+ " value is "+ nums[i]);

                    temp.add(j,nums[i]);
                    res.add(temp);
                }
            }
        }
    return res;

    }

    public static void main(String args[]){
        Test test=new Test();

        int[] nums={1,2,3};

        List<List<Integer>> result=test.permute(nums);
        //System.out.print("result size is "+result.size());
    }
}
