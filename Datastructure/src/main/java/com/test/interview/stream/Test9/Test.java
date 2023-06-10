package com.test.interview.stream.Test9;

import java.util.Arrays;
import java.util.List;

import com.test.interview.stream.Data.Project;

public class Test {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();
        List<Integer> numbers  = Arrays.asList(2, 4, 5, 6);

        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        System.out.println(sum);

        Integer reduce = numbers.stream()
                .reduce(0, (a, b) -> {System.out.println("a==="+a); System.out.println("b==="+b); return a+b;});
        System.out.println(reduce);
    }

}
