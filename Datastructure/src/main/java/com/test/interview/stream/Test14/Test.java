package com.test.interview.stream.Test14;

import com.test.interview.stream.Data.Project;

import java.util.List;

public class Test {

	public static void main(String[] args) {

        List<Project> projects = Project.buildData();
        Integer biezhi = projects.stream()
                .filter(p -> p.getAuthor().equals("biezhi"))
                .map(p -> p.getStars())
                .reduce(0, Integer::sum);
        System.out.println(biezhi);
    }
}
