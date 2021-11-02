package com.interview.amazon.exercise;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int teams = getTeams(new int[] { 3, 4, 3, 1, 6, 5 }, 3, 2);
        System.out.println(teams);
    }

    static int getTeams(int[] skills, int teamSize, int maxDiff) {
        Arrays.sort(skills);

        int n = teamSize - 1;
        int count = 0;
        for (int i = 0; i < skills.length - n; i++) {
            int start = skills[i];
            int end = skills[i + n];
            if (end - start <= maxDiff) {
                count++;
                i += n;
            }
        }
        return count;
    }
}
