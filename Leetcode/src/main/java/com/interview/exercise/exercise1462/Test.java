package com.interview.exercise.exercise1462;

import java.util.*;

public class Test {


    public List<Boolean> checkIfPrerequisite(int numCourses,int[][] prerequisites,int[][] queries){
        List<Integer>[] pre=new List[numCourses];

        Set<Integer>[] next=new HashSet[numCourses];

        int[] nextCount=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            pre[i]=new ArrayList<>();
            next[i]=new HashSet<>();
        }

        for(int[] p:prerequisites){
            pre[p[1]].add(p[0]);
            next[p[0]].add(p[1]);
            nextCount[p[0]]++;
        }

        boolean[] used=new boolean[numCourses];
        LinkedList<Integer> list=new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(nextCount[i]==0){
                list.add(i);
                used[i]=true;
            }
        }

        while(!list.isEmpty()){
            int remove=list.removeFirst();

            for(int i:pre[remove]){
                nextCount[i]--;

                next[i].addAll(next[remove]);

                if(nextCount[i]==0){
                    list.add(i);
                }
            }
        }

        List<Boolean> result=new ArrayList<>(queries.length);
        for(int[] q:queries){
            result.add(next[q[0]].contains(q[1]));
        }
        return result;
    }

    public static void main(String args[]){
        int numCourses = 3;
        int[][] prerequisites = new int[][]{{1,2},{1,0},{2,0}};
        int[][] queries =new int[][]{{1,0},{1,2}};


        Queue<String>[] queue = new Queue[3];

        Test test=new Test();
        test.checkIfPrerequisite(numCourses,prerequisites,queries).stream().forEach(System.out::println);

    }
}
