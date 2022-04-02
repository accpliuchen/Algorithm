package com.interview.exercise.exercise1109;

//https://www.youtube.com/watch?v=n5_pD7FRiKM
//https://blog.csdn.net/katrina95/article/details/102126208
//https://www.cnblogs.com/habibah-chang/p/13059911.html

public class Test {

//    public int[] corpFlightBookings(int[][] bookings, int n) {
//        if(bookings.length==0){
//            return new int[0];
//        }
//        int [] res = new int[n];
//
//        for(int i =0 ;i < bookings.length;i++){
//            res[bookings[i][0]-1]+= bookings[i][2];
//            if(bookings[i][1]<n){
//                res[bookings[i][1]]-= bookings[i][2];
//            }
//        }
//        for(int i =1;i<n;i++){
//            res[i] += res[i-1];
//        }
//        return res;
//    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int len=bookings.length;
        int[] ans=new int[n];

        for(int i=0;i<len;i++){
            int[] a=bookings[i];

            System.out.println("a[0] value is "+a[0]);
            System.out.println("a[2] value is "+a[2]);
            ans[a[0]-1]+=a[2];
            if(a[1]<n) {
                ans[a[1]] -= a[2];
                System.out.println("inside");
                System.out.println("a[1] value is "+a[1]);
                System.out.println("a[2] value is "+a[2]);

            }
        }

        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }


        return ans;
    }

    public static void main(String[] args) {

        int[][] array={{1,2,10},{2,3,20},{2,5,25}};

        Test test=new Test();
        int[] result=test.corpFlightBookings(array,5);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
