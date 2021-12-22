package com.interview.exercise.exercise36;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public boolean inValidSudoku(char[][] board){

        for(int i=0;i<board.length;i++){
            Set<Character> rowsSet=new HashSet();
            Set<Character> colsSet=new HashSet();
            Set<Character> cubeSet=new HashSet();

            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.' && !rowsSet.add(board[i][j])) return false;
                if(board[j][i]!='.' && !colsSet.add(board[j][i])) return false;

                //System.out.println(i/3);

                int rowIndex=3*(i/3);
                int colIndex=3*(i%3);

                System.out.println("rowIndex value is "+ rowIndex);


                if(board[rowIndex+j/3][colIndex+j%3]!='.' && !cubeSet.add(board[rowIndex+j/3][colIndex+j%3])) return false;
            }
        }

        return true;
    }

    public static void main(String args[]){

        char[][] board = new char[][]
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        Test test=new Test();
        boolean result=test.inValidSudoku(board);

        System.out.println("result vaule is "+ result);


        System.out.println(9%3);
    }
}
