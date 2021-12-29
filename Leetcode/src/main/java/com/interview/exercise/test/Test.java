package com.interview.exercise.test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Test {


    static int evenSumK(int arr[], int N)
    {


        // Stores maximum even
        // subsequence sum
        int maxSum = 0;

        // Stores Even numbers
        ArrayList<Integer> Even = new ArrayList<Integer>();


        // Traverse the array
        for (int i = 0; i < N; i++) {

            // If current element
            // is an odd number
            if (arr[i] % 2 != 1) {

                // Insert even numbers
                Even.add(arr[i]);
            }
        }


        // Sort Even[] array
        Collections.sort(Even);

        // Stores current index
        // Of Even[] array
        int i = Even.size() - 1;
        int K=arr.length;

        while (K > 0) {

            // If K is odd
            if (K % 2 == 1) {

                // If count of elements
                // in Even[] >= 1
                if (i >= 0) {

                    // Update maxSum
                    maxSum += Even.get(i);

                    // Update i
                    i--;
                }

                // If count of elements
                // in Even[] array is 0.
                else {
                    return -1;
                }

                // Update K
                K--;
            }

            // If count of elements
            // in Even[] and odd[] >= 2
            else if (i >= 1) {

                    // Update maxSum
                    maxSum += Even.get(i) + Even.get(i - 1);

                    // Update i
                    i -= 2;

                // Update K
                K -= 2;
            }

            // If count of elements
            // in Even[] array >= 2.
            else if (i >= 1) {

                // Update maxSum
                maxSum += Even.get(i) + Even.get(i - 1);

                // Update i
                i -= 2;

                // Update K
                K -= 2;
            }

        }
        return maxSum;
    }

    // Driver code
    public static void main(String[] args)
    {
//        int arr[] = { 2, 4, 10, 3, 5 };
//        int N = arr.length;
//        int K = 3;
//
//        System.out.println(evenSumK(arr, N));

//        char[] s=new char[]{'h','e','l','l','o'};
//        char[] c=new char[s.length];
//        char temp;
//        int k=s.length-1;
//        int a=0;
//        while(k>0){
//            temp=s[k];
//            s[k]=s[a];
//            s[a]=temp;
//            k--;
//            a++;
//        }
//
//        for(int j=0;j<s.length;j++){
//            System.out.print(s[j]);
//        }

    }
}

//    public static int maxSum(int[][] matrix){
//        int len=matrix.length-1;
//        int max[]=matrix[len];
//
//        for(int i=len-1;i>=0;i--){
//            for(int j=0;j<=i;j++){
//                max[j]=Math.max(max[j],max[j+1])+matrix[i][j];
//            }
//        }
//        return  max[0];
//    }
//
//    public static int coverStringToBinary(String str,int num){
//        int coveredInt=0;
//
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='1'){
//                int len=str.length()-1-i;
//                coveredInt+=Math.pow(num,len);
//            }
//        }
//
//        return coveredInt;
//    }
//
//    public static int val(char c)
//    {
//        if (c >= '0' && c <= '9')
//            return (int)c - '0';
//        else
//            return (int)c - 'A' + 10;
//    }
//
//    public static int toDeci(String str, int base)
//    {
//        int len = str.length();
//        int power = 1; // Initialize
//        // power of base
//        int num = 0; // Initialize result
//        int i;
//
//        // Decimal equivalent is
//        // str[len-1]*1 + str[len-2] *
//        // base + str[len-3]*(base^2) + ...
//        for (i = len - 1; i >= 0; i--)
//        {
//            // A digit in input number
//            // must be less than
//            // number's base
//            if (val(str.charAt(i)) >= base)
//            {
//                System.out.println("Invalid Number");
//                return -1;
//            }
//
//            num += val(str.charAt(i)) * power;
//            power = power * base;
//        }
//
//        return num;
//    }
//
//    public static void main(String args[]){
//
//        int[][] matrix={{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
//
//        //int result=Test.maxSum(matrix);
//
//       // System.out.println("result value is "+result);
//
//        System.out.println("coverStringToBinary is "+coverStringToBinary("111",2));
//
//        System.out.println("coverStringToBinary is "+coverStringToBinary("457",10));
//
//        System.out.println("coverStringToBinary is "+coverStringToBinary("17",8));
//
//
//        System.out.println("coverStringToBinary is "+toDeci("111",2));
//        System.out.println("coverStringToBinary is "+toDeci("457",10));
//        System.out.println("coverStringToBinary is "+toDeci("17",8));
//
//    }

//}
