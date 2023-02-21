package edu.laicode.exercise118;

import java.util.Arrays;

public class Test {

    public int[] dedup(int[] array) {
        int end = -1;
        for (int i = 0; i < array.length; i++) {
            int cur = array[i];
            if (end == -1 || cur != array[end]) {
                array[++end] = array[i];
            } else {
                while (i + 1 < array.length && array[i + 1] == cur) {
                    i++;
                }
                end --;
            }
        }
        return Arrays.copyOf(array, end + 1);
    }

    public static void main(String args[]){
        Test test=new Test();

        int[] array=new int[]{1, 2, 3, 3, 3, 2, 2};

        int[] result=test.dedup(array);

        for(int res:result){
            System.out.println(res);
        }
    }
}
