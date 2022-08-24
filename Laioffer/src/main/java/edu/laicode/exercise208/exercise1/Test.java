package edu.laicode.exercise208.exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Test {

    public List<Integer> majority(int[] array, int k) {
        // Write your solution here

        HashMap<Integer, Integer> counters = new HashMap<Integer, Integer>();
        for (Integer num : array) {
            if (!counters.containsKey(num)) {
                counters.put(num, 1);
            } else {
                counters.put(num, counters.get(num) + 1);
            }
            if (counters.size() >= k) {
                removeKey(counters);
            }
        }


        // corner case
        if (counters.size() == 0) {
            List<Integer> result=new ArrayList<Integer>();
            return result;
        }

        // re-count the numbers
        // for (Integer num : counters.keySet()) {
        //     counters.put(num, 0);
        // }
        // for (Integer num : array) {
        //     if (counters.containsKey(num)) {
        //         counters.put(num, counters.get(num) + 1);
        //     }
        // }

        // find majority
        List<Integer> result=new ArrayList<Integer>();
         int maxCounter = 0, maxKey = 0;
         for (Integer num : counters.keySet()) {
               if(counters.get(num)>array.length/k){
             //if (counters.get(num) > maxCounter) {
                 //maxCounter = counters.get(num);
                 result.add(num);
             }
         }

//        for(int i=0;i<k;i++){
//            if(counters.get(i)>array.length/k){
//                result.add(counters.get(i));
//            }
//        }
        return result;
    }

    private void removeKey(HashMap<Integer, Integer> counters) {
        Set<Integer> keySet = counters.keySet();
        List<Integer> removeList = new ArrayList<>();
        for (Integer key : keySet) {
            counters.put(key, counters.get(key) - 1);
            if (counters.get(key) == 0) {
                removeList.add(key);
            }
        }
        for (Integer key : removeList) {
            counters.remove(key);
        }
    }

    public static void main(String args[]){
//        int[] array=new int[]{1,2,1,2,1};
//        int k=3;

//		int[] array=new int[]{1, 2, 1, 2, 3, 3, 1};
//		int k=4;

//		int[] array=new int[]{2,1};
//		int k=2;

        // int[] array=new int[]{1,2,2};
        // int k=2;

        int[] array=new int[]{1,1};
        int k=3;

        Test test=new Test();
        List<Integer> result=test.majority(array,k);

        for(Integer nums:result){
            System.out.println("result value is "+ nums);
        }
    }
}
