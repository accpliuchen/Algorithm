package com.test.interview.countingsort;


//https://www.cnblogs.com/dongkuo/p/4832849.html
//https://zhuanlan.zhihu.com/p/128960048
public class Test {
    public static void main(String[] args) {
//        int[] array = { 2, 5, 3, 0, 2, 3, 0, 3 };

        int[] array = { 4,6,3,5,0,5,1,3,5,5 };

        countingSort(array, 6);
    }

    /**
     * 计数排序
     *
     * @param array
     *            待排序数组(假定各元素的范围是0~max，包括0和max)
     * @param max_number
     *            待排序数组中的最大值
     */
    public static int[] countingSort(int[] array, int max_number) {
        int[] result = new int[array.length];
        int[] temp_array = new int[max_number + 1];
        // counting elements
        for (int i : array) {
            temp_array[i]++;
        }

        System.out.println("Counting elements C array");
        printArray(temp_array);
        // after computing running sum
        for (int i = 1; i < temp_array.length; i++) {
            temp_array[i] += temp_array[i - 1];
        }

        System.out.println("computing running sum C array");
        printArray(temp_array);

        for (int i = array.length - 1; i > -1; i--) {
            result[temp_array[array[i]] - 1] = array[i];
            temp_array[array[i]]--;
        }

        System.out.println("after producing sorted B array");
        printArray(temp_array);

        System.out.println("Sorted B array");
        printArray(result);
        return result;
    }


    public static int[] countingSort(int[] array) {
        int[] result = new int[array.length];
        int[] temp = new int[7];
        // 以下循环操作完成后，temp的第i个位置保存着array中，值为i的元素的总个数
        for (int i : array) {
            temp[i]++;
        }

        System.out.println("Temp");
        printArray(temp);
        // 以下循环操作完成后，temp的第i个位置保存着array中，值小于或等于i的元素的总个数
        for (int i = 1; i < temp.length; i++) {
            temp[i] += temp[i - 1];
        }

        System.out.println("Temp2");
        printArray(temp);

        for (int i = array.length - 1; i > -1; i--) {
            result[temp[array[i]] - 1] = array[i];
            temp[array[i]]--;
        }

        System.out.println("Temp3");
        printArray(temp);

        return result;
    }

    /**
     * 打印数组
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
