package com.test.interview.stream.Test6;

import com.test.interview.stream.Data.Project;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Test {
	public static void main(String args[]){
		List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");

        words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList())
        .forEach(i -> System.out.println(i));

        List<Project> projects = Project.buildData();
        projects.stream().map(p->p.getName()).collect(Collectors.toList()).forEach(n->System.out.println(n));
	}
}
