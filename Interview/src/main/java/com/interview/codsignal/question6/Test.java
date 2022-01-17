package com.interview.codsignal.question6;

//https://www.chegg.com/homework-help/questions-and-answers/please-use-python-3-solve-def-almosttetris-n-m-figures-please-use-answer-another-chegg-pag-q83479392
//https://www.chegg.com/homework-help/questions-and-answers/codewriting-sheet-n-x-m-grid-paper-d-like-draw-cool-design--ve-decided-block-motif-similar-q56859268
//https://leetcode.com/discuss/interview-question/842141/Databricks-OA
//keywords:you have a sheet of n*m grid paper and you'd like to draw a cool design on it
public class Test {
//    int[][] solution(int n,int m,int[] figures){
//
//    }

    int[][][] figureDimension = {{{0, 0}}, {{0, 0}, {0, 1}, {0, 2}}, {{0, 0}, {0, 1}, {1, 0}, {1, 1}}, {{0, 0}, {1, 0}, {2, 0}, {1, 1}}, {{0, 1}, {1, 0}, {1, 1}, {1, 2}}};

    public int[][] almostTetris(int n, int m, int[] figures) {
        int[][] matrix = new int[n][m];
        int code = 1;
        for (int figure : figures) {
            boolean figurePlaced = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (isPossibleAtThisPoint(matrix, figureDimension[figure - 1], i, j, code)) {
                        figurePlaced = true;
                        code++;
                        break;
                    }
                }
                if (figurePlaced) {
                    break;
                }
            }
        }
        return matrix;
    }

    private boolean isPossibleAtThisPoint(int[][] matrix, int[][] fd, int x, int y, int code) {
        for (int i = 0; i < fd.length; i++) {
            int next_x = fd[i][0] + x;
            int next_y = fd[i][1] + y;
            if (next_x >= 0 && next_x < matrix.length && next_y >= 0 && next_y < matrix[0].length) {
                if (matrix[next_x][next_y] != 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        for (int i = 0; i < fd.length; i++) {
            int next_x = fd[i][0] + x;
            int next_y = fd[i][1] + y;
            matrix[next_x][next_y] = code;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[] figures = {4, 2, 1, 3};
        Test almostTetris = new Test();
        int[][] matrix=almostTetris.almostTetris(n, m, figures);

        System.out.println("");
    }
}
