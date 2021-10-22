package com.interview.exercise.exercise207;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

//https://www.cnblogs.com/yanhowever/p/11792739.html
public class Test {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegress=new int[numCourses];
        for(int[] cp:prerequisites){
            indegress[cp[0]]++;
        }

        LinkedList<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegress[i]==0)
                queue.addLast(i);
        }

        while(!queue.isEmpty()){
            Integer pre=queue.removeFirst();
            numCourses--;
            for(int[] req : prerequisites) {
                if(req[1]!=pre) continue;
                indegress[req[0]]--;
                if(indegress[req[0]] == 0) queue.add(req[0]);
            }
        }

        return numCourses==0;
    }


    public boolean canFinish_BFS(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj=new List[numCourses];

        for(int i=0;i<numCourses;i++){
            adj[i]=new ArrayList<Integer>();
        }

        int[] indegree=new int[numCourses];
        Queue<Integer>  readyCourses=new LinkedList<>();
        int finishedCount=0;

        for(int i=0;i<prerequisites.length;i++){
            int curCourse=prerequisites[i][0];
            int preCourse=prerequisites[i][1];

            System.out.println("curCourse value is "+curCourse);
            System.out.println("preCourse value is "+preCourse);

            adj[preCourse].add(curCourse);
            indegree[curCourse]++;

        }

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                readyCourses.offer(i);
        }

        while(!readyCourses.isEmpty()){
            int course=readyCourses.poll();
            finishedCount++;

            for(int nextCourse:adj[course]){
                indegree[nextCourse]--;

                if(indegree[nextCourse]==0)
                    readyCourses.offer(nextCourse);
            }
        }

        return finishedCount==numCourses;
    }

    public static void main(String args[]){
        int numCourses = 2;
        int[][]prerequisites ={{1,0},{0,1}};

        Test test=new Test();
        boolean result=test.canFinish_BFS(numCourses,prerequisites);

        System.out.println("result is "+result);
    }
}
