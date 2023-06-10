package com.test.interview.stream.Test3;

import com.test.interview.stream.Data.Project;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {

	public static void main(String args[]){
			List<Project> projects=Project.buildData();

			List<String> names=projects.stream().filter(p->{System.out.println(p.getName());return p.getStars()>1000;}).map(p->{System.out.println(p.getName()); return p.getName();}).limit(4).collect(Collectors.toList());

			//names.stream().forEach(name->System.out.println(name));
	}
}
