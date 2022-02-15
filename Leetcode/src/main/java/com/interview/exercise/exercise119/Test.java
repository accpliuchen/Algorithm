package com.interview.exercise.exercise119;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<Integer> getRow(int numRows) {
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<=numRows;i++){
            list.add(0,1);

            for(int j=1;j<list.size()-1;j++){
                System.out.println("value is "+j);
                list.set(j,list.get(j)+list.get(j+1));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int numRows=2;

        Test test=new Test();

        List<Integer> reuslt=test.getRow(numRows);

        for(Integer array:reuslt)
        System.out.println(array);
    }
}
