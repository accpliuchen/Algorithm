package com.test.interview.stream.Test8;


import com.test.interview.stream.Data.Project;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Test {

    public static void main(String[] args) {
        List<Project> projects = Project.buildData();

        boolean hasBiezhi = projects.stream()
                .anyMatch(p -> p.getAuthor().equals("biezhi"));

        System.out.println(hasBiezhi);

        System.out.println(projects.stream()
                .allMatch(p -> p.getAuthor().equals("biezhi")));

        System.out.println(projects.stream()
                .noneMatch(p -> p.getAuthor().equals("biezhi")));

        System.out.println(projects.stream().findAny().get());
        System.out.println(projects.stream().findFirst().get());
    }

}
