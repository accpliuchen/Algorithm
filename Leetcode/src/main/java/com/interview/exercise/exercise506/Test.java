package com.interview.exercise.exercise506;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Test {

    class Pairs{
        private int index;
        private int score;

        public Pairs(int index,int score){
            this.index=index;
            this.score=score;
        }

    }
    public String[] findRelativeRanks(int[] score) {
        if(score==null || score.length==0){
            return new String[0];
        }

        String[] result=new String[score.length];
        PriorityQueue<Pairs> queue=new PriorityQueue<Pairs>(new Comparator<Pairs>(){
            @Override
            public int compare(Pairs o1,Pairs o2){
                //return o2.score-o1.score;
                if(o2.score==o1.score){
                    return 0;
                }
                return o2.score<o1.score?-1:1;
            }
        });

        for(int i=0;i<score.length;i++){
            queue.add(new Pairs(i,score[i]));
        }

        int currRank=1;

        while(!queue.isEmpty()){
            Pairs pair=queue.poll();

            result[pair.index]="" + currRank;

            if(currRank==1){
                result[pair.index]="Gold Medal";
            }else if(currRank==2){
                result[pair.index]="Silver Medal";
            }else if(currRank==3){
                result[pair.index]="Bronze Medal";
            }
            currRank++;
        }

        return result;
    }

    public static void main(String args[]) {
        //int[] array = new int[]{5, 4, 3, 2, 1};

        int[] array = new int[]{10,3,8,9,4};

        Test test=new Test();
        String[] result=test.findRelativeRanks(array);

        for(String str:result)
           System.out.println(str);
    }
}
