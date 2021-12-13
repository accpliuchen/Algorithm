package com.interview.exercise.exercise1275;

public class Solution {

    public String tictactoe(int[][] moves) {
        int[][] matrix=new int[3][3];
        for(int i=0;i<moves.length;i++){

            if(matrix[moves[i][0]][moves[i][1]] != 0) {
                break;
            }
            if(i%2==0){
                matrix[moves[i][0]][moves[i][1]] = 2;
            }else{
                matrix[moves[i][0]][moves[i][1]] = 1;
            }
            boolean isA = (matrix[0][0] == 2 && matrix[0][1] == 2 && matrix[0][2] == 2)
                    || (matrix[1][0] == 2 && matrix[1][1] == 2 && matrix[1][2] == 2)
                    || (matrix[2][0] == 2 && matrix[2][1] == 2 && matrix[2][2] == 2)


                    || (matrix[0][0] == 2 && matrix[1][0] == 2 && matrix[2][0] == 2)
                    || (matrix[0][1] == 2 && matrix[1][1] == 2 && matrix[2][1] == 2)
                    || (matrix[0][2] == 2 && matrix[1][2] == 2 && matrix[2][2] == 2)


                    || (matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2)
                    || (matrix[0][2] == 2 && matrix[1][1] == 2 && matrix[2][0] == 2);

            if(isA) return "A";
            boolean isB = (matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1)
                    || (matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1)
                    || (matrix[2][0] == 1 && matrix[2][1] == 1 && matrix[2][2] == 1)

                    || (matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1)
                    || (matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1)
                    || (matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1)

                    || (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1)
                    || (matrix[0][2] == 1 && matrix[1][1] == 1 && matrix[2][0] == 1);
            if(isB) return "B";

        }
        return moves.length>=9? "Draw":"Pending";
    }

    public static void main(String args[]) {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};

        Solution solution=new Solution();
        String result=solution.tictactoe(moves);

        System.out.println("result value is "+ result);
    }
}
