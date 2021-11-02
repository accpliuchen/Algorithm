package com.interview.exercise.exercise1710;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

//    public int maximumUnits(int[][] B, int size) {
////        int remain=truckSize;
////        int totalUnit=0;
////        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
////        for(int i=0;i<boxTypes.length;i++){
////            int noOfBox=boxTypes[i][0];
////
////            System.out.println("noOfBox value is "+noOfBox);
////            for(int k=0;k<noOfBox;k++){
////                if(remain>0){
////                    remain=remain-1;
////
////                    System.out.println("totalUnit value is "+totalUnit);
////                    System.out.println("boxTypes[i][1] value is "+boxTypes[i][1]);
////
////                    totalUnit=totalUnit+(boxTypes[i][1]);
////                }
////            }
////        }
////        return totalUnit;
//
//
//        Arrays.sort(B, Comparator.comparingInt(a -> a[1]));
//
//        int total =0;
//        // iterate the loop from end
//        for (int i = B.length - 1; i >= 0; i--) {
//            if (size > B[i][0]) {
//
//                System.out.println("B[i]value "+ B[i][0]);
//                total += B[i][0]*B[i][1];
//                size = size - B[i][0];
//            }else {
//                total += size*B[i][1];
//                break;
//            }
//        }
//        return total;
//
//    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->{
            return -(a[1]-b[1]);
        });
        int res=0;

        for(int i=0;i<boxTypes.length;++i){
            if(truckSize>=0){
                System.out.println(boxTypes[i][0]);
                int curr=Math.min(truckSize,boxTypes[i][0]);
                System.out.println("boxTypes[i][1] "+ boxTypes[i][1]+ " curr "+ curr);
                res+=curr*boxTypes[i][1];
                truckSize-=curr;
            }else
                break;
        }


//        Arrays.sort(B, Comparator.comparingInt(a -> a[1]));
//
//        int total =0;
//        // iterate the loop from end
//        for (int i = B.length - 1; i >= 0; i--) {
//            if (size > B[i][0]) {
//                total += B[i][0]*B[i][1];
//                size = size - B[i][0];
//            }else {
//                total += size*B[i][1];
//                break;
//            }
//        }
//        return total;

        return res;
    }

    public static void main(String args[]){
        int[][] boxTypes={{5,10},{2,5},{4,7},{3,9}};
        int truckSize=10;

        Test test=new Test();
        int result=test.maximumUnits(boxTypes,truckSize);

        System.out.println("result value is "+ result);

    }
}
