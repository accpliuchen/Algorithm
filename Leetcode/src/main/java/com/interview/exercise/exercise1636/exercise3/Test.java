package com.interview.exercise.exercise1636.exercise3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String args[]){

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("before:"+ list);

        Collections.sort(list,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });

        System.out.println("after:"+list);
    }
}
