package com.test.interview.stream.Test5;

import com.test.interview.stream.Data.Project;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Test {

	public static void main(String args[]){
		List<Project> projects = Project.buildData();

        List<Project> collect = projects.stream()
                .filter(project -> project.getStars() > 1000)
                .collect(Collectors.toList());

        // distinct
        Stream<Integer> numbers = Stream.of(1, 2, 3, 3, 2, 4);
        numbers.distinct().limit(3).forEach(n -> System.out.println(n));

        System.out.println("===================");
        Stream.of(1, 2, 3, 3, 2, 4).skip(4).forEach(n -> System.out.println(n));
	}
}
