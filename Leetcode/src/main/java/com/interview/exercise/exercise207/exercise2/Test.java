package com.interview.exercise.exercise207.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    enum State{INIT,VISITING,VISITED}

    public boolean canFinish_DFS(int numCourses, int[][] prerequisites){
       List<Integer>[] graph=new List[numCourses];
       State[] state=new State[numCourses];

       for(int i=0;i< graph.length;++i){
           graph[i]=new ArrayList<>();
       }

       for(int[] p:prerequisites){
           graph[p[1]].add(p[0]);
       }

       for(int i=0;i<numCourses;++i){
           if(hasCycle(graph,i,state))
               return false;
       }
        return true;
    }

    private boolean hasCycle(List<Integer>[] graph,int u,State[] states){
        if(states[u]==State.VISITING)
            return true;

        if(states[u]==State.VISITED)
            return false;

        states[u]= State.VISITING;
        for(final int v:graph[u])
            if(hasCycle(graph,v,states))
                return true;
        states[u]=State.VISITED;

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
