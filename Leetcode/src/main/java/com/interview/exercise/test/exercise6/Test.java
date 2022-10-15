package com.interview.exercise.test.exercise6;

import java.util.*;

public class Test {

    public static int keyDiff = 0;
    public static long valDiff = 0;
    public static HashMap<Integer, Long> map = new HashMap<>();
    public static long rst = 0;
    public static void insertMap(int[] q) {
        int key = q[0];
        int val = q[1];
        key -= keyDiff;
        val -= valDiff;
        map.put(key, (long)val);
    }
    public static long getSum(int key) {
        key -= keyDiff;
        if(map.containsKey(key)) {
            long val = map.get(key);
            return val+valDiff;
        } else {
            return 0;
        }
    }
    public static long solution(String[] queryType, int[][] query) {
        int N = queryType.length;
        for(int i=0; i<N; i++) {
            int[] q = query[i];
            String qType = queryType[i];
            if(qType.equals("insert")) {
                insertMap(q);
            } else if(qType.equals("get")) {
                rst += getSum(q[0]);
            } else if(qType.equals("addToKey")) {
                keyDiff += q[0];
            } else {
                valDiff += q[0];
            }
        }
        return rst;
    }


    public static void main(String args[]){

        String[] queryType = new String[]{"insert", "insert", "addToValue", "addToKey", "get"};
        int[][] query = new int[][]{{1,2},{2, 3},{2},{1},{3}};

        Test test=new Test();
        long result = test.solution(queryType, query);

        System.out.println("Result is: "+ result);

        System.out.println("");

        for (Map.Entry<Integer, Long> set :
            Test.map.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
    }

}
