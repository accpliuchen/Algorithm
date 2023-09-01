package com.interview.meta.exercise1;

public class Test {
    public static int moveNonzeroElements(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left <= right) {
            while (left <= right && arr[left] != 0) {
                left++;
                count++;
            }

            while (left <= right && arr[right] == 0) {
                right--;
            }

            if (left < right) {
                // Swap the nonzero element from the left with the zero element from the right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                count++;
                left++;
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 0, 3, 4 };
        int nonzeroCount = moveNonzeroElements(arr);

        System.out.print("Updated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Number of nonzero elements: " + nonzeroCount);
    }
}
