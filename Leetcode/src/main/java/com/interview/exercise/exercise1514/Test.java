package com.interview.exercise.exercise1514;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Test {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        Map<Integer,List<Pair<Integer,Double>>> graph=new HashMap<>();

        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double pathProb=succProb[i];

            //graph.computeIfAbsent(u,k)

        }
        return 0d;
    }

    public static void main(String args[]){
        int n=3;
        int[][] edges = new int[][] {{0,1},{1,2},{0,2}};
        double[] succProb = new double[] {0.5,0.5,0.2};
        int start = 0;
        int end = 2;

        Test test=new Test();
        double result=test.maxProbability(n,edges,succProb,start,end);

        System.out.println("result value is "+ result);

    }
}
