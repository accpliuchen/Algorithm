package com.interview.exercise.exercise207.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

//https://leetcode.com/problems/course-schedule/discuss/58524/Java-DFS-and-BFS-solution

public class Test {
    public boolean canFinish_DFS(int numCourses, int[][] prerequisites) {
        ArrayList[] graph=new ArrayList[numCourses];
        int[] degree=new int[numCourses];
        Queue queue=new LinkedList();
        int count=0;

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList();
        }

        for(int i=0;i< prerequisites.length;i++){

            System.out.println("degree value is "+prerequisites[i][1]);
            degree[prerequisites[i][1]]++;
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for(int i=0; i<degree.length;i++){
            if(degree[i] == 0){
                queue.add(i);
                count++;
            }
        }

        while(queue.size() != 0){
            int course = (int)queue.poll();
            for(int i=0; i<graph[course].size();i++){
                int pointer = (int)graph[course].get(i);
                degree[pointer]--;
                if(degree[pointer] == 0){
                    queue.add(pointer);
                    count++;
                }
            }
        }
        if(count == numCourses)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int numCourses = 2;
//        int[][]prerequisites ={{1,0},{0,1}};
        int[][]prerequisites ={{1,0}};

        Test test=new Test();
        boolean result=test.canFinish_DFS(numCourses,prerequisites);

        System.out.println("result is "+result);
    }
}
