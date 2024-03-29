package com.test.interview.stream.Data;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Builder
public class Project {

	 private String name;

	 private String language;

	 private Integer stars;

	 private String author;

	 private String  description;

	 private Integer forks;


 	 public static List<Project> buildData(){

 	 		 List<Project> data=new ArrayList<>();

 	 		 data.add(Project.builder().name("Blade").language("java").author("biezhi")
                .stars(3500).forks(2000).description("Lightning fast and elegant mvc framework for Java8").build());

			 data.add(Project.builder().name("Tale").language("javascript").author("biezhi")
	                .stars(2600).forks(2300).description("Best beautiful java blog, worth a try").build());

	         data.add(Project.builder().name("Vue.js").language("js").author("yyx990803")
	                .stars(83000).forks(10322).description("A progressive, incrementally-adoptable JavaScript framework for building UI on the web.").build());

	         data.add(Project.builder().name("Flask").language("python").author("pallets")
	                .stars(10500).forks(3000).description("The Python micro framework for building web applications").build());

	         data.add(Project.builder().name("Elves").language("java").author("biezhi")
	                .stars(200).forks(100).description("Spider").build());

            return data;

 	 }


}
