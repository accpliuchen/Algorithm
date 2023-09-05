package com.interview.exercise.exercise480;

import java.util.PriorityQueue;
import java.util.Collections;

public class Test {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public double[] findSlidingWindowMedian(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {

            if (maxHeap.size() == 0 || maxHeap.peek() >= nums[i]) {
                maxHeap.add(nums[i]);
            } else {
                minHeap.add(nums[i]);
            }
            rebalanceHeaps();

            int windowStart = i - k + 1;
            if (windowStart >= 0) { // if we have at least 'k' elements in the sliding window

                if (maxHeap.size() == minHeap.size()) {
                    result[windowStart] = maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
                }
                else {
                    result[windowStart] = maxHeap.peek();
                }

                // remove the the element going out of the sliding window
                int removed = nums[windowStart];
                if (removed <= maxHeap.peek()) {
                    maxHeap.remove(removed);
                } else {
                    minHeap.remove(removed);
                }
                rebalanceHeaps();
            }
        }
        return result;
    }

    private void rebalanceHeaps() {
        // either both the heaps will have equal number of elements or max-heap will have
        // one more element than the min-heap
        if (maxHeap.size() > minHeap.size() + 1)
            minHeap.add(maxHeap.poll());
        else if (maxHeap.size() < minHeap.size())
            maxHeap.add(minHeap.poll());
    }


    public static void main(String[] args) {
        Test slidingWindowMedian = new Test();
//        double[] result = slidingWindowMedian.findSlidingWindowMedian(new int[] { 1, 2, -1, 3, 5 }, 2);
        double[] result = slidingWindowMedian.findSlidingWindowMedian(new int[] { 1,2,3,4,2,3,1,4,2 }, 3);
        System.out.print("Sliding window medians are: ");
        for (double num : result)
            System.out.print(num + " ");
        System.out.println();

//        slidingWindowMedian = new Test();
//        result = slidingWindowMedian.findSlidingWindowMedian(new int[] { 1, 2, -1, 3, 5 }, 3);
//        System.out.print("Sliding window medians are: ");
//        for (double num : result)
//            System.out.print(num + " ");
    }

}
