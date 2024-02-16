package com.interview.exercise.exercise1086;

import java.util.*;

public class Test {

    private int K;

    public int[][] highFive(int[][] items){
        this.K=5;

        TreeMap<Integer, Queue<Integer>> allScores=new TreeMap<Integer, Queue<Integer>>();
        for(int[] item:items){
            int id=item[0];
            int score=item[1];

            if(!allScores.containsKey(id)){
                allScores.put(id,new PriorityQueue<>());
            }

            allScores.get(id).add(score);

            if(allScores.get(id).size()>this.K){
                allScores.get(id).poll();
            }
        }

        List<int[]> solution=new ArrayList<>();

        for(int id:allScores.keySet()){
            int sum=0;
            for(int i=0;i<this.K;i++){
                sum+=allScores.get(id).poll();
            }
            solution.add(new int[]{id,sum/this.K});
        }

        int[][] solutionArray=new int[solution.size()][];
        return solution.toArray(solutionArray);
    }

    public static void main(String args[]){
        int[][] items=new int[][]{{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100}};

        Test test=new Test();

        int[][] result=test.highFive(items);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
