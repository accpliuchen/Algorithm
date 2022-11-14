package com.interview.exercise.exercise56;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {

	public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

	public static void main(String args[]){
		int[][] intervals=new int[][]{{1,3},{2,6},{8,10},{15,18}};

		Test test=new Test();
		int[][] result=test.merge(intervals);

		for (int row = 0; row < result.length; row++) {
		    for (int col = 0; col < result[row].length; col++) {
		       System.out.print(result[row][col]+" ");
		    }
            System.out.println();
		}
	}
}
