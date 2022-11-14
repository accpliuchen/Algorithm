package com.test.interview.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

//https://blog.csdn.net/u012250875/article/details/55126531
public class SortTest {

	class Dog{
		public int age;
		public String name;

		public Dog(int age,String name){
			super();

			this.age=age;
			this.name=name;
		}

		@Override
		public String toString(){
			return "Dog [age="+age+",name="+name+"]";
		}
	}

	public static void main(String args[]){
  	    List<Dog> list=new ArrayList<>();

  	    list.add(new SortTest().new Dog(5,"DogA"));
  	    list.add(new SortTest().new Dog(6,"DogB"));
  	    list.add(new SortTest().new Dog(7,"DogC"));


  	    System.out.println(list);


  	    Collections.sort(list,new Comparator<Dog>(){

  	        @Override
  	        public int compare(Dog o1,Dog o2){

  	        	return o2.age-o1.age;
  	        }		
  	    });
  	    System.out.println(list);

        System.out.println("===============================");

        Collections.sort(list,new Comparator<Dog>(){
        	@Override
        	public int compare(Dog o1,Dog o2){
        		return o1.name.compareTo(o2.name);
        	}
        });

        System.out.println(list);
	}
}
