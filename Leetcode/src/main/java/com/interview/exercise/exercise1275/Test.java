package com.interview.exercise.exercise1275;

public class Test {

    public String tictactoe(int[][] moves) {
        int rowCounter=0;
        int colCounter=0;
        int mainCounter=0;
        int subCounter=0;

        int key=(moves.length-1)%2;
        int[] last=moves[moves.length-1];

        int he=last[0]+last[1];
        int cha=last[0]-last[1];

        for(int i=0;i<moves.length;i++){
            if(i%2==key){
                System.out.println(i);
                int[] move=moves[i];

                if(move[0]==last[0]){
                    rowCounter++;
                }

                if(move[1]==last[1]){
                    colCounter++;
                }

            }
        }

        if(moves.length<9){
            return "Pending";
        }


        return "Draw";
    }

    public static void main(String args[]){
        int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        Test test=new Test();

        System.out.println(test.tictactoe(moves));
    }
}
