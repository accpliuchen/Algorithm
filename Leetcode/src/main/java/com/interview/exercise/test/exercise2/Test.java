package com.interview.exercise.test.exercise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {

    public long solution(List<List<Integer>> operations) {
        HashSet<Integer> rec = new HashSet<> ();
        long res = 0L;
        for (List<Integer> op : operations) {
            for (int j = op.get(0); j <= op.get(1); j++) {
                if (!rec.add(j)) {
                    rec.remove(j);
                }
            }
        }


        for (int i : rec) {
            res += i;
        }

        return res;
    }

    public static void main(String[] args) {
        Test test=new Test();

//        List<Integer> result1=new ArrayList<>();
//        result1.add(3);
//        result1.add(1);
//
//        List<Integer> result2=new ArrayList<>();
//        result2.add(2);
//        result2.add(2);
//
//        List<Integer> result3=new ArrayList<>();
//        result3.add(3);
//        result3.add(4);
//
//        List<Integer> result4=new ArrayList<>();
//        result4.add(2);
//        result4.add(3);
//
//        List<Integer> result5=new ArrayList<>();
//        result5.add(2);
//        result5.add(2);

        List<Integer> result1=new ArrayList<>();
        result1.add(4);
        result1.add(5);

        List<Integer> result2=new ArrayList<>();
        result2.add(1);
        result2.add(4);

        List<Integer> result3=new ArrayList<>();
        result3.add(2);
        result3.add(6);

        List<Integer> result4=new ArrayList<>();
        result4.add(1);
        result4.add(5);

//        List<Integer> result5=new ArrayList<>();
//        result5.add(2);
//        result5.add(2);

        List<List<Integer>> param=new ArrayList<>();
        param.add(result1);
        param.add(result2);
        param.add(result3);
        param.add(result4);
//        param.add(result5);


        long res=test.solution(param);

        System.out.println("resutl value is "+ res);
    }
}
