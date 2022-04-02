package com.interview.exercise.exercise118;

import java.util.List;
import java.util.ArrayList;

public class Test {

    public List<List<Integer>>  generate(int numRows){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            list.add(0,1);

            for(int j=1;j<list.size()-1;j++){
                list.set(j,list.get(j)+list.get(j+1));
            }
            res.add(new ArrayList<>(list));
        }

        return res;
    }

    public static void main(String args[]){
        int numRows = 5;

        Test test=new Test();
        List<List<Integer>> result=test.generate(5);

        System.out.println("result value is "+result.size());
    }
}
