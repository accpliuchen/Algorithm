package com.interview.hackerrank.balancingElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/discuss/interview-question/856945/balancing-development-teams-hackerrank-oa-how-to-solve
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(0);
//        list.add(2);
//        list.add(2);
//        list.add(1);
//        System.out.println(maxBalancedTeams(list, 3));


//        list.add(3);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(7);

        list.add(2);
        list.add(1);
        list.add(6);
        list.add(4);

        int maxNewHire=4;

//        list.add(2);
//        list.add(2);
//        list.add(2);
//
//        int maxNewHire=3;
        System.out.println(maxBalancedTeams(list, maxNewHire));


        System.out.println(balance(new int[]{2,1,6,4}));

    }


    public static int balance(int[] nums){
        int n = nums.length;
        int[] leftOdd = new int[n], leftEven = new int[n];
        int[] rightOdd = new int[n], rightEven = new int[n];
        int odd = 0, even = 0;
        for(int i=0;i<n;i++){
            leftOdd[i] = odd;
            leftEven[i] = even;
            if(i%2==0)
                even += nums[i];
            else
                odd += nums[i];
        }
        odd = 0;
        even = 0;
        for(int i=n-1;i>=0;i--){
            rightOdd[i] = odd;
            rightEven[i] = even;
            if(i%2==0)
                even += nums[i];
            else
                odd += nums[i];
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(leftOdd[i] + rightEven[i] == leftEven[i] + rightOdd[i]){
                System.out.println("id:" + i);
                count++;
            }
        }
        return count;
    }


    public static int maxBalancedTeams(List<Integer> developers, int maxNewHires) {
        Collections.sort(developers); // sort the array in ascending order
        int[] prefixSum = new int[developers.size() + 1]; // make prefix sum array

        prefixSum[1] = developers.get(0);

        for (int i = 1; i < prefixSum.length - 1; ++i) {
            prefixSum[i + 1] = prefixSum[i] + developers.get(i);
        }

        // Run binary search for the number denoting MAXIMUM NUMBER OF TEAMS HAVING SAME
        // NUMBER OF MEMBERS

        // initialize variables
        int max = developers.size(); // Possible that all teams may have same number of members
        int min = 1; // Worst case scenario, distinct number of members in all teams
        int ans = 1;
        while (min <= max) {
            int mid = (max + min) / 2; // find mid as we do in binary search denoting NUMBER OF TEAMS HAVING SAME
            // NUMBER OF DEVELOPERS

            // check if there exist some groups in which members can be added to make "mid"
            // number of groups have equal members
            if (check(prefixSum, mid, maxNewHires, developers)) {
                ans = mid;
                min = mid+1; // if there exist such case, look for a better case. Increase min to mid.
            } else {
                max = mid - 1; // if not, look for a worse case. decrease max to mid.
            }
        }
        return ans;
    }

    public static boolean check(int[] pSum, int len, int maxHire, List<Integer> dev) {

        // Run sliding window of length you got using binary search
        int i = 0;
        int j = len;
        while (j <= dev.size()) {
            int maxSize = dev.get(j - 1); // the last element of the sliding window will be having the max size in the
            // current window as we sorted the list at the start
            int totalMembers = maxSize * len; // for all teams to have same number of members, the total number of
            // members should be equal to (length of window)*(max team size of
            // current window)
            int currMembers = pSum[j] - pSum[i]; // the current number of members in all the teams of the current
            // sliding window
            if (currMembers + maxHire >= totalMembers) {
                return true; // Now if the current members of the window, plus the members we are allowed to
                // add, is greater or equal to the total members we wanted, return true
            } else {
                i++;
                j++;
            }
        }
        return false;
    }
}
