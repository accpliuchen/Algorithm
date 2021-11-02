package com.interview.exercise.greedy;

//https://www.google.com/search?q=%E6%9C%80%E4%BC%98%E8%A3%85%E8%BD%BD%E9%97%AE%E9%A2%98&sxsrf=AOaemvK6sDAm9ECpNuXa1T9NbeiS47th9Q%3A1635488985465&source=hp&ei=2ZR7YdfxFt-0ytMPo_CYqAQ&iflsig=ALs-wAMAAAAAYXui6USkkE80zHoG2lacnDRevLvTuSyf&oq=%E6%9C%80%E4%BC%98%E8%A3%85%E8%BD%BD%E9%97%AE%E9%A2%98&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECdQ8gJY8gJgxwZoAHAAeACAAYQBiAGEAZIBAzAuMZgBAKABAqABAQ&sclient=gws-wiz&ved=0ahUKEwiXwoeg_-7zAhVfmnIEHSM4BkUQ4dUDCAk&uact=5

import java.util.Arrays;

public class Test {

    public static int MAXWEIGHT=30;
    public static int AMOUNT=8;


    public  static int maxLoading(int[] weight){
        int counter=0;

        Arrays.sort(weight);
        int temp=0;
        for(int i=0;i<AMOUNT;i++){
            temp+=weight[i];
            if(temp<=MAXWEIGHT)
                counter++;
            else
                break;
        }

        return counter;

    }

    public static void main(String args[]){


        int[] weight={4,10,7,11,3,5,14,2};
        int result=Test.maxLoading(weight);

        System.out.println("size is "+ result);
    }
}
