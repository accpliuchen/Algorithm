package com.interview.exercise.exercise502;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test {

    class Project implements Comparable<Project> {
        int capital, profit;

        public Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }

        public int compareTo(Project project) {
            return capital - project.capital;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        Project[] projects = new Project[n];
        for (int i = 0; i < n; i++) {
            projects[i] = new Project(capital[i], profits[i]);
        }
        Arrays.sort(projects);
        // PriorityQueue is a min heap, but we need a max heap, so we use
        // Collections.reverseOrder()
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(n, Collections.reverseOrder());
        int ptr = 0;
        for (int i = 0; i < k; i++) {
            while (ptr < n && projects[ptr].capital <= w) {
                q.add(projects[ptr++].profit);
            }
            if (q.isEmpty()) {
                break;
            }
            w += q.poll();
        }
        return w;
    }

    public static void main(String args[]){
//        int k = 2, w = 0;
//        int[] profits = new int[] {1,2,3};
//        int[] capital = new int[] {0,1,1};

        int k = 3, w = 0;
        int[] profits = new int[] {1,2,3};
        int[] capital = new int[] {0,1,2};

        Test test=new Test();
        int result=test.findMaximizedCapital(k,w,profits,capital);

        System.out.println("result value is "+ result);

    }
}
