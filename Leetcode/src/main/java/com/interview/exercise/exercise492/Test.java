package com.interview.exercise.exercise492;

public class Test {

    public int[] constructRectangle(int area){
        int lim=(int)Math.sqrt(area);

        int[] ans=new int[2];

        for(int i=1;i<=lim;i++){
            if(area%i==0){
                ans[1]=i;
                ans[0]=area/i;
            }
        }

        return ans;
    }

    public static void main(String args[]){
        int area=4;

        Test test=new Test();

        int[] result=test.constructRectangle(area);

        System.out.println("result value is "+result[0]+" "+result[1]);
    }
}
