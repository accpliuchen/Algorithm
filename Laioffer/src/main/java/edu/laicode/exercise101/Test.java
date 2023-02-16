package edu.laicode.exercise101;

public class Test {

    public int largest(int[][] matrix) {
        // Write your solution here

        int N=matrix.length;
        if(N==0){
            return 0;
        }

        int result=0;

        int[][] largest=new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0 || j==0){
                    largest[i][j]=matrix[i][j]==1?1:0;
                }else if(matrix[i][j]==1){
                    largest[i][j]=Math.min(largest[i][j-1]+1,largest[i-1][j]+1);
                    largest[i][j]=Math.min(largest[i-1][j-1]+1,largest[i][j]);
                }
                result=Math.max(result,largest[i][j]);
            }
        }

        return result;
    }


    public static void main(String args[]){

        int[][] matrix=new int[][]{{0,0,0,0},{1,1,1,1},{0,1,1,1},{1,0,1,1}};
        Test test=new Test();

        int result=test.largest(matrix);
        System.out.println(result);
    }

}
