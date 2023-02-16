package com.interview.hackerrank.slowestkeypress;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static char slowestKey(List<List<Integer>> keyTimes) {
        char slowestKey = (char) (keyTimes.get(0).get(0) + 'a');
        int maxTime = 0;
        for (int i = 0; i < keyTimes.size(); i++) {
            int time = i == 0 ? keyTimes.get(i).get(1) : keyTimes.get(i).get(1) - keyTimes.get(i - 1).get(1);
            if (time >= maxTime) {
                maxTime = time;
                slowestKey = (char) (keyTimes.get(i).get(0) + 'a');
            }
        }
        return slowestKey;
    }

    public static void main(String args[]){
        List<List<Integer>> result=new ArrayList<>();

        List<Integer> r1=new ArrayList<>();
        r1.add(0);
        r1.add(2);

        List<Integer> r2=new ArrayList<>();
        r2.add(1);
        r2.add(3);

        List<Integer> r3=new ArrayList<>();
        r3.add(0);
        r3.add(7);

//        List<Integer> r4=new ArrayList<>();
//        r4.add(2);
//        r4.add(15);


        result.add(r1);
        result.add(r2);
        result.add(r3);
//        result.add(r4);

        Test test=new Test();
        char res=test.slowestKey(result);

        System.out.println(res);
    }

}
