package com.interview.exercise.exercise1037;

public class Test {

    public boolean isBoomerang(int[][] points){

        if(points.length!=3 || points[0].length!=2) return false;

        int [] xdif = new int[points.length - 1];
        int [] ydif = new int[points.length - 1];

        for (int i = 1; i < points.length; i++) {
            xdif[i-1] = points[i][0] - points[0][0];
            ydif[i-1] = points[i][1] - points[0][1];
        }
        return xdif[0] * ydif[1] != xdif[1] * ydif[0];
    }

    public static void main(String args[]){
        int[][] points={{1,1},{2,3},{3,2},{3,7}};

        Test test=new Test();
        boolean result=test.isBoomerang(points);

        System.out.println("result value is "+ result);
    }
}
