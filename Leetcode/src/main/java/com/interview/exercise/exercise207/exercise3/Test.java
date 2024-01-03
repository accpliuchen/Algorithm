package com.interview.exercise.exercise207.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Test {
    
    public boolean canFinish(int  numCourses,int[][] prerequisites){

        int[] indegree=new int[numCourses];
        List<List<Integer>> adj=new ArrayList<>(numCourses);

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for (int[] prerequisite:prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }

        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }

        int nodeVisited=0;

        while(!queue.isEmpty()){
            int node=queue.poll();
            nodeVisited++;


            System.out.println("==="+node);
            for(int neighbor: adj.get(node)){
                indegree[neighbor]--;

                if(indegree[neighbor]==0){
                    queue.offer(neighbor);
                }
            }
        }


        return nodeVisited==numCourses;
    }

    public static void main(String args[]){
        int numCourses = 2;
////        int[][]prerequisites ={{1,0},{0,1}};
        int[][]prerequisites ={{1,0}};


//        int numCourses = 6;
//        int[][]prerequisites ={{0,2},{1,2},{1,3},{1,4},{2,0},{2,3},{2,5},{3,5},{4,5}};

//        int numCourses = 4;
//        int[][]prerequisites ={{1,0},{2,0},{3,1},{3,2}};

        Test test=new Test();
        boolean result=test.canFinish(numCourses,prerequisites);

        System.out.println("result is "+result);
    }
}
