package com.interview.exercise.exercise1424;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList();
        queue.offer(new Pair(0, 0));
        List<Integer> ans = new ArrayList();

        while (!queue.isEmpty()) {
            Pair<Integer, Integer> p = queue.poll();
            int row = p.getKey();
            int col = p.getValue();
            ans.add(nums.get(row).get(col));

            if (col == 0 && row + 1 < nums.size()) {
                queue.offer(new Pair(row + 1, col));
            }

            if (col + 1 < nums.get(row).size()) {
                queue.offer(new Pair(row, col + 1));
            }
        }

        // Java needs conversion
        int[] result = new int[ans.size()];
        int i = 0;
        for (int num : ans) {
            result[i] = num;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<List<Integer>> numsList = new ArrayList<>();

        for (int[] row : nums) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : row) {
                rowList.add(num);
            }
            numsList.add(rowList);
        }

//        List<Integer> flattenedList = listOfLists.stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//        System.out.println("Flattened list: " + flattenedList);

        List<Integer> outputList=numsList.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(outputList);


         Test test=new Test();

         System.out.println(Arrays.toString(test.findDiagonalOrder(numsList)));


    }
}
