package com.test.interview.list.comparator2;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

//cnblogs.com/wenqiangit/p/10986437.html
//https://www.codenong.com/cs105887131/
public class Test {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("a",2));
        personList.add(new Person("b",4));
        personList.add(new Person("c",7));

        personList.sort(Comparator.comparingInt(Person::getAge));

        personList.sort(Comparator.comparingInt(Person::getAge).reversed());

        System.out.println(personList.toString());
    }
}

class Person{
    private String name;
    private Integer age;

    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
