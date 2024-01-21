package com.interview.exercise.exercise130;

import java.util.LinkedList;

class Pair<U,V>{
    public U first;
    public V second;

    public Pair(U first,V second){
        this.first=first;
        this.second=second;
    }
}


public class Test {

    protected Integer ROWS=0;
    protected Integer COLS=0;

    public void solve(char[][] board){
        if(board==null || board.length==0){
            return ;
        }

        this.ROWS=board.length;

    }

//    protected void DFS(char[][] board,int r,int c){
//        LinkedList<Pair<Integer,Integer>> queue=new LinkedList<Pair<Integer,Integer>>();
//        queue.offer(new Pair<>(r,c));
//
//        while(!queue.isEmpty()){
//            Pair<Integer,Integer> pair=queue.poll();
//
//            int row=pair.first,col= pair.second;
//
//            if(board[row][col]!='0')
//                continue;;
//
//            board[row][col]='E';
//
//            if(col<this.)
//        }
//    }


    public static void main(String args[]){
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        
    }
}
