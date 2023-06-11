package com.test.interview.stream.Test12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.test.interview.stream.Data.Project;

public class Test {

	public static void main(String args[]){
		List<Project> projects=Project.buildData();

		projects.stream().map(Project::getName).limit(3).collect(Collectors.toList()).forEach(n->System.out.println(n));
	}
}
