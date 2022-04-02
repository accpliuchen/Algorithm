package com.interview.exercise.exercise989;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Test {
    public List<Integer> addToArrayFrom(int[] A,int k){
        int n=A.length;
        int cur=k;
        int i=n-1;

        List<Integer> list=new ArrayList<>();


        while(i>=0 || cur>=0){

            if(i>=0) cur=cur+A[i];

            list.add(cur%10);
            cur/=10;

            i--;
        }

        Collections.reverse(list);

        return list;
    }


    public static void main(String args[]){
        int[] nums=new int[]{1,2,0,0};
        int k=34;

        Test test=new Test();
        List<Integer>  result=test.addToArrayFrom(nums,k);

        for(Integer results:result){
            System.out.println(results);
        }

    }
}
