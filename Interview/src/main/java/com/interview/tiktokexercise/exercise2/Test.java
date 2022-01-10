package com.interview.tiktokexercise.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static long waysRecursive(int n, long[] results) {
        if (n == 0) {
            results[0] = 1;
            return results[0];
        }
        if (n == 1) {
            results[n] = 2;
            return results[n];
        }
        if (n == 2) {
            results[n] = 9;
            return results[n];
        }
        else if (results[n] > 0) {
            return results[n];
        }
        else {
            results[n] = waysRecursive(n - 1, results) * 3 + waysRecursive(n - 2, results) * 3 - waysRecursive(n - 3, results);
            return results[n];
        }
    }

    public static long ways(int n) {
        long[] results = new long[n + 1];
        return waysRecursive(n, results);
    }

    public static List<Integer> ways(List<Integer> nvalues) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nvalues.size(); i++) {
            long curResult = ways(nvalues.get(i));
            list.add((int)curResult % (1000000000 + 7));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}
