package edu.laicode.exercise401;

public class Test {

    public int search(int[] array, int target) {
        // Write your solution here
        if (array == null || array.length == 0) {
            return -1;
        }
        int maxValueIndex = findMaxValueIndex(array, 0, array.length - 1);
        int leftSide = binarySearchUp(array, target, 0, maxValueIndex);
        int rightSide = binarySearchDown(array, target, maxValueIndex + 1, array.length - 1);

        if (leftSide == -1 && rightSide == -1) {
            return -1;
        } else {
            return leftSide == -1 ? rightSide : leftSide;
        }
    }

    private int binarySearchUp(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchDown(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int findMaxValueIndex(int[] array, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= array[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

	public static void main(String args[]){
        int[] array=new int[]{1, 4, 7, 11, 6, 2, -3, -8};
        int target=2;

        Test test=new Test();
        int result=test.search(array,target);

        System.out.println(result);
	}
}
