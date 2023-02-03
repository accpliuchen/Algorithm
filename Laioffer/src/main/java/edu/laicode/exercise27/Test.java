package edu.laicode.exercise27;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class Test {

    public int kthSum(int[] A, int[] B, int k) {
        // Write your solution here
        int[][] matrix = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                matrix[i][j] = A[i] + B[j];
            }
        }

// Build the minHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Maintain a hashSet to remove duplicates
        Set<Integer> hashSet = new HashSet<>();

        Set<int[]> set = new HashSet<>();

// Initiate: add root to the minHeap
        minHeap.offer(matrix[0][0]);
        int rowIterator = 0;
        int colIterator = 0;
        int expandNode = 0;


        //popCounter < k && rowIterator < matrix.length-1 && colIterator < matrix[0].length-1 && minHeap.size()!=0
        for (int i = 0; i < k - 1; i++) {
            expandNode = minHeap.poll();
            hashSet.add(expandNode);
            if (colIterator + 1 < B.length) {
                int right = matrix[rowIterator][colIterator + 1];
                if (!hashSet.contains(right)) {
                    minHeap.offer(right);
                    colIterator++;
                }
            }
            if (rowIterator + 1 < A.length) {
                int bottom = matrix[rowIterator + 1][colIterator];
                if (!hashSet.contains(bottom)) {
                    minHeap.offer(bottom);
                    rowIterator++;
                }
            }

        }
        return minHeap.peek();
    }

    public static void main(String args[]) {

        int[] A = new int[]{1, 3, 5, 8, 9};
        int[] B = new int[]{2, 3, 4, 7};
        int target = 7;

        Test test = new Test();
        int result = test.kthSum(A, B, target);

        System.out.println(result);
    }
}
