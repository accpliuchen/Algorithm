package com.test.interview.list.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        list.add(new User("张三", 5));
        list.add(new User("李四", 30));
        list.add(new User("王五", 19));
        list.add(new User("王麻子", 17));

        // 按年龄排序
        Collections.sort(list);
        System.out.println(list.toString());
   }
}


class User implements Comparable<User>{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "User [name=" + name+ ",age="+age+"]";
    }

    @Override
    public int compareTo(User user){
        return this.age-user.getAge();
    }
}
