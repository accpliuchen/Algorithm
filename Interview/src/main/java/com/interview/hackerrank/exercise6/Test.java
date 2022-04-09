package com.interview.hackerrank.exercise6;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Test {

    public static int equalizeArray(List<Integer> arr) {
        int max=1;

        Map<Integer,Integer> nums=new HashMap<>();

        for(int num:arr){
            if(!nums.containsKey(num)){
                nums.put(num, 1);
            }else{
                nums.put(num, nums.get(num) + 1);
                if (max < nums.get(num))
                    max = nums.get(num);
            }
        }
        return arr.size()-max;
    }

    public static  void main(String args[]){
        List<Integer> arr=new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(3);

        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
//        arr.add(2);

        Test test=new Test();
        int result=test.equalizeArray(arr);

        System.out.println("result value is "+ result);
    }
}
