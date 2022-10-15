package com.interview.exercise.test.exercise4;

public class Test {
    private static int N = 4;

    // function find maximum sum path
//    private static int maximumPath(int Mat[][]){
////        int result = 0;
////
////        // create 2D matrix to store the sum
////        // of the path
////        int dp[][] = new int[N][N + 2];
////
////        // copy all element of first row into
////        // 'dp' first row
////        for (int i = 0; i < N; i++)
////            dp[0][i + 1] = Mat[0][i];
////
////        for (int i = 1; i < N; i++)
////            for (int j = 1; j <= N; j++)
////                dp[i][j] = Math.max(dp[i - 1][j - 1],
////                        Math.max(dp[i - 1][j],
////                                dp[i - 1][j + 1])) +
////                        Mat[i][j - 1];
////
////        // Find maximum path sum that end ups
////        // at any column of last row 'N-1'
////        for (int i = 0; i <= N; i++)
////            result = Math.max(result, dp[N - 1][i]);
////
////        // return maximum sum path
////        return result;
//
//
//    }

    private static int maxEnergy(int Mat[][]){
        //Create a 2d array of size 4x4, which is same as mat
        int helper[][] = new int[N][N + 2];
        //Now,using a for loop,start traversing mat array from it's last row
        for(int i=3;i>=0;i--){
            //Inside, that for loop,start another for loop,to traverse all the columns from right to left
            for(int j=3;j>=0;j--){
                //If it is the last row then,store (i,j)th element of mat array in (i,j)th cell helper array
                if(i==3)helper[i][j]=Mat[i][j];
                    //If it is the last column but not the first column then,
                else if(j==3 && j>0){
                    //Store (i,j)th element of mat array in (i,j)th cell of helper array
                    helper[i][j]=Mat[i][j];
                    //Then add the minimum value between (i+1,j)th and (i+1,j-1)th value of mat with (i,j)th value of helper array
                    if(helper[i+1][j]<helper[i+1][j-1])helper[i][j]+=helper[i+1][j];
                    else helper[i][j]+=helper[i+1][j-1];
                }
                //If it is the first column but not the last column then,
                else if(j<3 && j==0){
                    //Store (i,j)th element of mat array in (i,j)th cell of helper array
                    helper[i][j]=Mat[i][j];
                    //Then add the minimum value between (i+1,j+1)th and (i+1,j)th value of mat with (i,j)th value of helper array
                    if(helper[i+1][j]<helper[i+1][j+1])helper[i][j]+=helper[i+1][j];
                    else helper[i][j]+=helper[i+1][j+1];
                }
                //If it is the first and last column then
                else if(j==3 && j==0){
                    //Add (i+1,j)th value of helper and (i,j)th value of mat, then store that in (i,j)th cell of helper array
                    helper[i][j]=Mat[i][j]+helper[i+1][j];
                }
                //Otherwise,
                else{
                    //Store (i,j)th element of mat array in (i,j)th cell of helper array
                    helper[i][j]=Mat[i][j];
                    //Then add the minimum value among (i+1,j+1)th,(i+1,j)th and (i+1,j-1)th value of mat with (i,j)th value of helper array
                    if(helper[i+1][j]<=helper[i+1][j+1] && helper[i+1][j]<=helper[i+1][j-1])helper[i][j]+=helper[i+1][j];
                    else if(helper[i+1][j+1]<=helper[i+1][j] && helper[i+1][j+1]<=helper[i+1][j-1])helper[i][j]+=helper[i+1][j+1];
                    else if(helper[i+1][j-1]<=helper[i+1][j] && helper[i+1][j-1]<=helper[i+1][j+1])helper[i][j]+=helper[i+1][j-1];
                }
            }
        }
        //Now,using a for loop,find out the smallest value of first row in helper array,and store that in used_energy variable
        int used_energy=helper[0][0];
        for(int i=0;i<4;i++){
            if(helper[0][i]<used_energy)used_energy=helper[0][i];
        }
        //Now,subtract used_energy from 100,and return that
        return (100-used_energy);
    }

    // driver code
    public static void main(String arg[]){
//        int Mat[][] = { { 4, 2, 3, 4 },
//                { 2, 9, 1, 10 },
//                { 15, 1, 3, 0 },
//                { 16, 92, 41, 44 } };

        int Mat[][] = { { 10,20,30,40 },
                { 60,50,20,80},
                { 10, 10, 10, 10 },
                { 60, 50, 60, 50 } };

        System.out.println(maxEnergy(Mat));
    }
}


