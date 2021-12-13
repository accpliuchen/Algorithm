package com.interview.exercise.exercise120;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public int minimumTotal(List<List<Integer>> triangle) {

        int n=triangle.size();
        if(n==1) return triangle.get(0).get(0);

        for(int i=n-2;i>=0;i--){
            int size=triangle.get(i).size();

            for(int j=0;j<size;j++){
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String args[]){
        List<Integer> one=new ArrayList<>();
        one.add(new Integer(2));

        List<Integer> two=new ArrayList<>();
        two.add(new Integer(3));
        two.add(new Integer(4));

        List<Integer> three=new ArrayList<>();
        three.add(new Integer(6));
        three.add(new Integer(5));
        three.add(new Integer(7));

        List<Integer> four=new ArrayList<>();
        four.add(new Integer(4));
        four.add(new Integer(1));
        four.add(new Integer(8));
        four.add(new Integer(3));

        List<List<Integer>> result=new ArrayList<>();
        result.add(one);
        result.add(two);
        result.add(three);
        result.add(four);

        Test test=new Test();
        int s=test.minimumTotal(result);

        System.out.println("result value is "+s);
    }
}
