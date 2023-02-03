package edu.laicode.exercise26;

import java.util.PriorityQueue;
import java.util.Comparator;

class Cell {
    int row;
    int col;
    int value;

    Cell (int r, int c, int v) {
        row = r;
        col = c;
        value = v;
    }
}

public class Test {

//    public int kthSmallest(int[][] matrix, int k) {
//        // Write your solution here
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        boolean[][] visited = new boolean[n][m];
//        PriorityQueue<Cell> pq = new PriorityQueue<>(new Comparator<Cell>(){
//            @Override
//            public int compare(Cell a, Cell b) {
//                return a.value == b.value ? 0 : a.value < b.value ? 1 : -1;
//            }
//        });
//
//// initial state
//        visited[0][0] = true;
//        pq.offer(new Cell(0, 0, matrix[0][0]));
//
//// loop (assume 0 < k <= n * m — clarify with interviewer) — poll k-1 times and run algorithm
//        for (int i = 0; i < k - 1; i++) {
//            // Expand
//            Cell cur = pq.poll();
//            // Generate – bottom and right neighbors
//
//            // bottom
//            if (cur.row < n - 1 && !visited[cur.row + 1][cur.col]) {
//                pq.offer(new Cell(cur.row + 1, cur.col, matrix[cur.row + 1][cur.col]));
//                visited[cur.row + 1][cur.col] = true;
//            }
//
//// right
//            if (cur.col < m - 1 && !visited[cur.row][cur.col + 1]) {
//                pq.offer(new Cell(cur.row, cur.col + 1, matrix[cur.row][cur.col + 1]));
//                visited[cur.row][cur.col + 1] = true;
//            }
//        }
//
//// poll k-th time and return its value
//        return pq.poll().value;
//    }

    public int kthSmallest(int[][] matrix, int k) {
        // Write your solution here
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] visited = new boolean[n][m];
        PriorityQueue<Cell> pq = new PriorityQueue<>(new Comparator<Cell>(){
            @Override
            public int compare(Cell a, Cell b) {
                return a.value == b.value ? 0 : a.value < b.value ? -1 : 1;
            }
        });

// initial state
        visited[0][0] = true;
        pq.offer(new Cell(0, 0, matrix[0][0]));

// loop (assume 0 < k <= n * m — clarify with interviewer) — poll k-1 times and run algorithm
        for (int i = 0; i < k - 1; i++) {
            // Expand
            Cell cur = pq.poll();
            // Generate – bottom and right neighbors

            // bottom
            if (cur.row < n - 1 && !visited[cur.row + 1][cur.col]) {
                pq.offer(new Cell(cur.row + 1, cur.col, matrix[cur.row + 1][cur.col]));
                visited[cur.row + 1][cur.col] = true;
            }

// right
            if (cur.col < m - 1 && !visited[cur.row][cur.col + 1]) {
                pq.offer(new Cell(cur.row, cur.col + 1, matrix[cur.row][cur.col + 1]));
                visited[cur.row][cur.col + 1] = true;
            }
        }

// poll k-th time and return its value
        return pq.poll().value;
    }

    public static void main(String args[]) {
        int[][] matrix = {{1,3,5,7}, {2,4,8,9}, {3,5,11,15}, {6,8,13,18}};

        Test test = new Test();
        int target=8;

        int result=test.kthSmallest(matrix,target);

        System.out.println(result);
    }
}
