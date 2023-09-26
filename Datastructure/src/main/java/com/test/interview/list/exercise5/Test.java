package com.test.interview.list.exercise5;

import java.util.List;
import java.util.ArrayList;

public class Test {

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            int val1 = list1.get(i);
            int val2 = list2.get(j);

            if (val1 < val2) {
                mergedList.add(val1);
                i++;
            } else if (val1 > val2) {
                mergedList.add(val2);
                j++;
            } else {
                // Handle duplicates
                mergedList.add(val1);
                i++;
                j++;
            }
        }

        // Add remaining elements from both lists (if any)
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(3, 4, 6, 8);

        List<Integer> mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged List with Duplicates: " + mergedList);
    }
}
