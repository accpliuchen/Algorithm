package com.interview.codsignal.question1;

public class Test {

    public  String[] generateSquare(int n) {
        String[] result = new String[n];
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append('*');
        }
        result[0] = sb.toString();
        result[n - 1] = sb.toString();

        sb = new StringBuilder("");

        sb.append('*');
        for (int i = 0; i < n - 2; i++) {
            sb.append(" ");
        }
        sb.append('*');

        String str = sb.toString();

        for (int i = 1; i < n - 1; i++) {
            result[i] = str;
        }

        return result;
    }


    public String[] generateSquare2(int n) {
        StringBuilder sb = new StringBuilder();
        String[] result = new String[n];

        for(int i=0;i<n;i++){
            sb.append("*");
        }

        result[0]=sb.toString();
        result[n-1]=sb.toString();


        sb=new StringBuilder();
        sb.append("*");

        for(int i=0;i<n-2;i++){
            sb.append(" ");
        }

        sb.append("*");

        String str=sb.toString();

        for(int i=1;i<n-1;i++){
            result[i]=str;
        }


        return result;
    }






//    public void generateSquare(int n){
//
//        String[] result = new String[n];
//
//        for(int j=1;j<n+1;j++) {
//            for (int i = 1; i < n + 1; i++) {
//                if(j==1 ||j==n)
//                    System.out.print("*");
//                else {
//                    if(i==1) {
//                        System.out.print("*");
//                    }else{
//                        System.out.print(" ");
//                    }
//
//                    if(i==7) {
//                        System.out.print("*");
//                    }
//                }
//            }
//
//            System.out.println("");
//        }
//
//    }


    public static void main(String args[]){

        Test test=new Test();

        //test.generateSquare2(8);

        String[] result=test.generateSquare2(8);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }


    }
}
