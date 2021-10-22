package com.interview.exercise.exercise210;

import java.lang.reflect.Array;
import java.util.Queue;
import java.util.ArrayDeque;

public class Test {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
         int[] res=new int[numCourses];
         int[] indegree=new int[numCourses];

        for(int[] pre : prerequisites) {
            indegree[pre[0]] ++;
        }

         Queue<Integer> queue=new ArrayDeque<>();
         for(int i=0;i<numCourses;i++){
             if(indegree[i]==0){
                 queue.offer(i);
             }
         }

         int i=0;
         while(!queue.isEmpty()){
             Integer curr=queue.poll();

             res[i++]=curr;

             for(int[] pre:prerequisites){
                 if(pre[1]==curr){
                     indegree[pre[0]]--;
                     if(indegree[pre[0]]==0){
                         queue.offer(pre[0]);
                     }
                 }
             }

         }
         return i==numCourses?res:new int[]{};
    }


    public static void main(String args[]){
        int numCourses = 4;
        int[][]prerequisites ={{1,0},{2,0},{3,1},{3,2}};

        Test test=new Test();
        int[]result=test.findOrder(numCourses,prerequisites);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
