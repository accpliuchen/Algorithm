package com.test.interview.stream.Test10;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import com.test.interview.stream.Data.Project;

public class Test {

	public static void main(String args[]){
		List<Project> projects=Project.buildData();

		OptionalInt max=projects.stream().mapToInt(p->p.getStars()).max();

		System.out.println(max.getAsInt());

	}
}
