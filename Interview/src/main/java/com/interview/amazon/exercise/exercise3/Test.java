package com.interview.amazon.exercise.exercise3;

public class Test {

    public int countingValleys(int steps, String path) {
        int s=0;
        int v=0;

        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='D'){
                s--;
            }else if(path.charAt(i)=='U' && (s+1)==0){
                s++;
                v++;
            }else{
                s++;
            }
        }

        return v;
    }

    public static void main(String[] args) {
        int step=8;
        String path="UDDDUDUU";

        Test test=new Test();
        int result=test.countingValleys(step,path);


        System.out.println("result value is "+ result);

    }
}
