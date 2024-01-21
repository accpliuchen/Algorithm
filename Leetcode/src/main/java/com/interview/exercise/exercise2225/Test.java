package com.interview.exercise.exercise2225;

import java.util.*;

public class Test {

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> lossesCount=new HashMap<>();

        for(int[] match:matches){
            int winner=match[0],loser=match[1];
            lossesCount.put(winner,lossesCount.getOrDefault(winner,0));
            lossesCount.put(loser,lossesCount.getOrDefault(loser,0)+1);
        }

        List<List<Integer>> answer= Arrays.asList(new ArrayList<>(),new ArrayList<>());

        for(Integer player:lossesCount.keySet()){
            if(lossesCount.get(player)==0){
                answer.get(0).add(player);
            }else if(lossesCount.get(player)==1){
                answer.get(1).add(player);
            }
        }

        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));

        return answer;
    }

    public static void main(String args[]){
        int[][] matches = new int[][]{{2,3},{1,3},{5,4},{6,4}};

        Test test=new Test();
        List<List<Integer>> listOfLists =test.findWinners(matches);

        for (List<Integer> innerList : listOfLists) {
            // Loop through the inner list
            for (Integer value : innerList) {
                // Output each element
                System.out.print(value + " ");
            }
            // Move to the next line after each inner list
            System.out.println();
        }
    }

}
