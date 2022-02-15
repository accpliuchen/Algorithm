package com.test.interview.list.comparator1;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

//https://www.cnblogs.com/wenqiangit/p/10986437.html

public class Test {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,4,2,6,2,8);
//        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
