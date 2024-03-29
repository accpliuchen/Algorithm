package com.interview.exercise.exercise2035;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/discuss/1513595/Java-meet-in-middle

public class Test {
    public int minimumDifference(int[] nums) {
        final int n = nums.length / 2;
        final int sum = Arrays.stream(nums).sum();
        final int goal = sum / 2;
        final int[] lNums = Arrays.copyOfRange(nums, 0, n);
        final int[] rNums = Arrays.copyOfRange(nums, n, nums.length);

        int ans = Integer.MAX_VALUE;
        List<Integer>[] lSums = new List[n + 1];
        List<Integer>[] rSums = new List[n + 1];

        for (int i = 0; i <= n; ++i) {
            lSums[i] = new ArrayList<>();
            rSums[i] = new ArrayList<>();
        }

        dfs(lNums, 0, 0, 0, lSums);
        dfs(rNums, 0, 0, 0, rSums);

        for (int lCount = 0; lCount <= n; ++lCount) {
            List<Integer> l = lSums[lCount];
            List<Integer> r = rSums[n - lCount];
            Collections.sort(r);
            for (final int lSum : l) {
                final int i = firstGreaterEqual(r, goal - lSum);
                if (i < r.size()) {
                    final int sumPartOne = sum - lSum - r.get(i);
                    final int sumPartTwo = sum - sumPartOne;
                    ans = Math.min(ans, Math.abs(sumPartOne - sumPartTwo));
                }
                if (i > 0) {
                    final int sumPartOne = sum - lSum - r.get(i - 1);
                    final int sumPartTwo = sum - sumPartOne;
                    ans = Math.min(ans, Math.abs(sumPartOne - sumPartTwo));
                }
            }
        }

        return ans;
    }

    private void dfs(int[] A, int i, int count, int path, List<Integer>[] sums) {
        if (i == A.length) {
            sums[count].add(path);
            return;
        }
        dfs(A, i + 1, count + 1, path + A[i], sums);
        dfs(A, i + 1, count, path, sums);
    }

    private int firstGreaterEqual(List<Integer> A, int target) {
        int l = 0;
        int r = A.size();
        while (l < r) {
            final int m = l + (r - l) / 2;
            if (A.get(m) >= target)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Test test=new Test();
        //int[] nums=new int[]{76,8,45,20,74,84,28,1};

        int[] nums=new int[]{2,-1,0,4,-2,-9};

        int result=test.minimumDifference(nums);

        System.out.println("result value is "+ result);
    }
}
