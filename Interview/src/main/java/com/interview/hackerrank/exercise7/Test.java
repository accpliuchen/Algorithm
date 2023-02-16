package com.interview.hackerrank.exercise7;

import java.util.*;

public class Test {

    public static void main(String args[]){
        Stack stack=new Stack();

        stack.push(1);
        stack.push(1.1);
        stack.push('z');
        stack.push("Hello");


        for (Iterator<String> i = stack.iterator(); i.hasNext();) {
            String item = i.next();
            System.out.println(item);
        }
    }
}
