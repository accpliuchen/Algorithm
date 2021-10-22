package com.interview.exercise.matrix;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/rotate-matrix-right-k-times/
public class Test {

    // size of matrix
    static final int M=3;
    static final int N=3;

    // function to rotate matrix by k times
    static void rotateMatrix(int matrix[][], int k)
    {
        // temporary array of size M
        int temp[]=new int[M];

        // within the size of matrix
        k = k % M;

        for (int i = 0; i < N; i++)
        {

            // copy first M-k elements
            // to temporary array
            for (int t = 0; t < M - k; t++)
                temp[t] = matrix[i][t];

            // copy the elements from k
            // to end to starting
            for (int j = M - k; j < M; j++)
                matrix[i][j - M + k] = matrix[i][j];
//
//            // copy elements from
//            // temporary array to end
            for (int j = k; j < M; j++)
                matrix[i][j] = temp[j - k];
        }
    }

    // function to display the matrix
    static void displayMatrix(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        int matrix[][] = {{12, 23, 34},
                {45, 56, 67},
                {78, 89, 91}};
        int k = 2;

        displayMatrix(matrix);

        System.out.println();

        // rotate matrix by k
        rotateMatrix(matrix, k);

        // display rotated matrix
        displayMatrix(matrix);
    }
}

//
//    public static  void main(String args[]){
////        List<Integer> signalOne=new ArrayList<>();
////
////        signalOne.add(new Integer(1));
////        signalOne.add(new Integer(2));
////        signalOne.add(new Integer(3));
////        signalOne.add(new Integer(3));
////        signalOne.add(new Integer(3));
////        signalOne.add(new Integer(5));
////        signalOne.add(new Integer(4));
////
////
////        List<Integer> signalTwo=new ArrayList<>();
////
////        signalTwo.add(new Integer(1));
////        signalTwo.add(new Integer(2));
////        signalTwo.add(new Integer(3));
////        signalTwo.add(new Integer(4));
////        signalTwo.add(new Integer(3));
////        signalTwo.add(new Integer(5));
////        signalTwo.add(new Integer(4));
////
////        int maxequals=-1;
////        int ans=0;
////        int len=Math.min(signalOne.size(),signalTwo.size());
////
////        for(int i=0;i<len;i++){
////            if((signalOne.get(i).equals(signalTwo.get(i))) && signalOne.get(i)>maxequals){
////                maxequals=signalOne.get(i);
////                ans++;
////            }
////        }
////
////
////        System.out.println("ans value is "+ans);
//
//
//    }
// }
