package com.interview.exercise.exercise1436;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public String destCity(List<List<String>> paths) {
        Set<String> hasOutgoing = new HashSet();
        for (int i = 0; i < paths.size(); i++) {
            hasOutgoing.add(paths.get(i).get(0));
        }

        for (int i = 0; i < paths.size(); i++) {
            String candidate = paths.get(i).get(1);
            if (!hasOutgoing.contains(candidate)) {
                return candidate;
            }
        }

        return "";
    }
    public static void main(String args[]){
        List<List<String>> paths = new ArrayList<>();

        // Adding paths ["B","C"], ["D","B"], and ["C","A"]
        List<String> path1 = new ArrayList<>();
        path1.add("B");
        path1.add("C");

        List<String> path2 = new ArrayList<>();
        path2.add("D");
        path2.add("B");

        List<String> path3 = new ArrayList<>();
        path3.add("C");
        path3.add("A");

        paths.add(path1);
        paths.add(path2);
        paths.add(path3);

        // Displaying the paths added to the List<List<String>>
        System.out.println("Paths added to the list:");
        for (List<String> path : paths) {
            System.out.println(path);
        }


        Test test=new Test();

        String result=test.destCity(paths);


        System.out.println(result);

    }
}
