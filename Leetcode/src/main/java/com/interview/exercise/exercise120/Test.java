package com.interview.exercise.exercise120;

import java.util.ArrayList;
import java.util.List;

public class Test {

//    public int minimumTotal(List<List<Integer>> triangle) {
//
//        int n=triangle.size();
//        if(n==1) return triangle.get(0).get(0);
//
//        for(int i=n-2;i>=0;i--){
//            int size=triangle.get(i).size();
//
//            for(int j=0;j<size;j++){
//                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
//            }
//        }
//        return triangle.get(0).get(0);
//    }


//    public int minimumTotal(List<List<Integer>> triangle) {
//        int count=triangle.size();
//
//        int[] dp=new int[count];
//
//        List<Integer> lastRow=triangle.get(count-1);
//
//        for(int i=0;i<count;i++){
//            dp[i]=lastRow.get(i);
//            //System.out.println(dp[i]);
//        }
//
//
//
//        for(int i=count-2;i>=0;i--){
//            List<Integer> currentRow=triangle.get(i);
//            System.out.println(currentRow);
//            for(int j=0;j<i+1;j++){
//                //dp[i]=currentRow.
//                System.out.print(dp[j]);
//                System.out.print("    "+dp[j+1]);
//                dp[j]=currentRow.get(j)+Math.min(dp[j],dp[j+1]);
//                System.out.println("result "+ dp[j]);
//            }
//        }
//
//        return dp[0];
//    }
//
    public int minimumTotal(List<List<Integer>> triangle){
       int count=triangle.size();

       int[] dp=new int[triangle.size()];

       List<Integer> lastRow=triangle.get(count-1);

       for(int i=0;i<count;i++){
           dp[i]=lastRow.get(i);
       }

       for(int i=count-2;i>=0;i--){
           List<Integer> currentRow=triangle.get(i);
           for(int j=0;j<i+1;j++){

               System.out.print(" currentRow.get(j) value is "+currentRow.get(j));
               System.out.print("     dp min value is "+Math.min(dp[j],dp[j+1]));
               dp[j]=currentRow.get(j)+Math.min(dp[j],dp[j+1]);
           }
           System.out.println("");
       }


       return dp[0];
    }

    public static void main(String args[]){
        List<Integer> one=new ArrayList<>();
        one.add(new Integer(2));

        List<Integer> two=new ArrayList<>();
        two.add(new Integer(3));
        two.add(new Integer(4));

        List<Integer> three=new ArrayList<>();
        three.add(new Integer(6));
        three.add(new Integer(5));
        three.add(new Integer(7));

        List<Integer> four=new ArrayList<>();
        four.add(new Integer(4));
        four.add(new Integer(1));
        four.add(new Integer(8));
        four.add(new Integer(3));

        List<List<Integer>> result=new ArrayList<>();
        result.add(one);
        result.add(two);
        result.add(three);
        result.add(four);

        Test test=new Test();
        int s=test.minimumTotal(result);

        System.out.println("result value is "+s);

        int a=315;
        int b=840;

        System.out.println(a%b);
    }
}
