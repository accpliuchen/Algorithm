package edu.laicode.exercise117.exercise1;

import java.util.Arrays;

public class Test {

    public int[] dedup(int[] array) {
        // Write your solution here

        if (array == null || array.length < 2) {
            return array;
        }

        int fast = 1;
        int slow = 0;
        int end = 0;

        while (fast != array.length) {
            if (array[fast] != array[slow]) {
                if ((fast - slow) == 1) {
                    array[end] = array[slow];
                    ++end;
                }

                slow = fast;
                ++fast;
            }
            else {
                ++fast;
            }
        }

        if (slow == (array.length - 1)) {
            array[end] = array[slow];
            ++end;
        }

        return Arrays.copyOf(array, end);

    }

    public static void main(String args[]){
        int[] array=new int[]{1, 2, 2, 3, 3, 3};

        Test test=new Test();

        int[] arrays=test.dedup(array);

        for(int index:arrays){
            System.out.println(index);
        }

    }


}
