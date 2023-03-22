package edu.laicode.exercise267;

public class Test {

    public int[] search(int[][] matrix, int target) {
        // Write your solution here
        if(matrix==null || matrix.length==0){
            return new int[]{-1,-1};
        }

        int rows=matrix.length;
        int cols=matrix[0].length;
        int left=0;
        int right=rows*cols-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            int row=mid/cols;
            int col=mid%cols;

            if(matrix[row][col]==target){
                return new int[]{row,col};
            }else if(matrix[row][col]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return new int[]{-1,-1};
    }


    public static void main(String args[]){
//        int[][] matrix=new int[][]{ {1, 2, 3}, {4, 5, 7}, {8, 9, 10} };
//        int target=7;

        int[][] matrix=new int[][]{{1,2,5,6,8},{4,5,5,7,11},{7,7,10,11,11},{9,12,14,14,14}};

        int target=10;

        Test test=new Test();
        int[] result=test.search(matrix,target);

        for(int res:result)
            System.out.println(res);
    }
}
