package com.interview.exercise.exercise621;

import java.util.Arrays;

//https://www.cnblogs.com/silentteller/p/14011287.html
//https://blog.csdn.net/weixin_42970433/article/details/109765413
//一个公式，那就是q是拥有相同最大任务数的任务种类个数，n表示间隔时间，max是最大任务数，则最短时间为(max-1)*(n+1) + q，示例就是(3-1)*(2+1)+2=8
public class Test {

    public int leastInterval(char[] tasks, int n) {
        int[] arr=new int[26];
        for(char ch:tasks){
            arr[ch-'A']++;
        }

        int maxNum= Arrays.stream(arr).max().getAsInt();
        int q=0;

        for(int a:arr){
            if(a==maxNum){
                q++;
            }
        }

        int res=(maxNum-1)*(n+1)+q;
        return res > tasks.length ? res : tasks.length;
    }

    public static void main(String args[]){
        char[] tasks = new char[]{'A','A','A','B','B','B'};
        int n = 2;

        Test test=new Test();
        int result=test.leastInterval(tasks,n);

        System.out.println(result);

    }
}
