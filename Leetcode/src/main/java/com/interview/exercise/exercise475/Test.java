package com.interview.exercise.exercise475;

import java.util.Arrays;

public class Test {

    public int findRedius(int[] houses,int[] heaters){
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int ans=0;
        for(int i=0,j=0;i<houses.length;i++){
            int r=Math.abs(houses[i]-heaters[j]);

            System.out.println(" heaters j value is "+ heaters[j+1]);

            while(j<heaters.length-1 && Math.abs(houses[i]-heaters[j])>=Math.abs(houses[i]-heaters[j+1])){

                System.out.print("i value is "+ i +" j value is "+ j);
                System.out.println(" houses i value is "+ houses[i]);
                System.out.println(" heaters j value is "+ heaters[j+1]);
                j++;
                r=Math.min(r,Math.abs(houses[i]-heaters[j]));
            }
            ans=Math.max(ans,r);
        }

        return ans;
    }


    public static void main(String args[]){
        int[] houses =new int[] {1,2,3};
        int[] heaters =new int[] {2};

//        int[] houses =new int[] {1,5};
//        int[] heaters =new int[] {2};

//        int[] houses =new int[] {1,2,3,4};
//        int[] heaters =new int[] {1,4};


        Test test=new Test();
        int result=test.findRedius(houses,heaters);

        System.out.println(result);
    }
}
