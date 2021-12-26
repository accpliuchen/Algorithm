package com.interview.codsignal.question4;

import java.util.HashMap;

public class Test {

    public int[] solution(String[] queries,int diff){
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            char sign = queries[i].charAt(0);
            int target = Integer.parseInt(queries[i].substring(1));

            if (sign == '+') {
                hm1.put(target, hm1.getOrDefault(target, 0) + 1);
            }
            else {
                hm1.remove(target);
            }

            int total = 0;
            for (int j : hm1.keySet()) {
                int cur = hm1.get(j);
                if (hm1.containsKey(j + diff)) {
                    total += cur * hm1.get(j + diff);
                }
            }

            result[i] = total;
        }

        return result;
    }

    public static void main(String args[]){

    }
}
