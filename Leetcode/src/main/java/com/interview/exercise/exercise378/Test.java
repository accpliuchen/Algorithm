package com.interview.exercise.exercise378;

import java.util.Comparator;
import java.util.PriorityQueue;

class Cell{
     int row;
     int col;
     int value;


    public Cell(int row,int col,int value){
        this.row=row;
        this.col=col;
        this.value=value;
    }

}

public class Test {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        int col=matrix[0].length;

        boolean[][] visited=new boolean[row][col];
        PriorityQueue<Cell> minHeap=new PriorityQueue<>(k, new Comparator<Cell>() {
            @Override
            public int compare(Cell c1, Cell c2) {
                return Integer.compare(c1.value,c2.value);
            }
        });

        visited[0][0]=true;
        minHeap.offer(new Cell(0,0,matrix[0][0]));

        for(int i=0;i<k-1;i++){
            Cell cur=minHeap.poll();

            if(cur.row<row-1 && !visited[cur.row+1][cur.col]){
                minHeap.offer(new Cell(cur.row+1,cur.col,matrix[cur.row+1][cur.col]));
                visited[cur.row+1][cur.col]=true;
            }


            if(cur.col<col-1 && !visited[cur.row][cur.col+1]){
                minHeap.offer(new Cell(cur.row,cur.col+1,matrix[cur.row][cur.col+1]));
                visited[cur.row][cur.col+1]=true;
            }
        }

        return minHeap.poll().value;
    }

    public static void main(String args[]){

        int[][]  matrix =new int[][] {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;

        Test test=new Test();
        int result=test.kthSmallest(matrix,k);

        System.out.println(result);
    }
}
