package com.interview.hackerrank.papercutting.exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;

public class Test {
    static class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int hashCode(){
            return this.x + this.y;
        }
        @Override
        public boolean equals(Object o){
            if(! (o instanceof Pair)){
                return false;
            }
            Pair b = (Pair) o;
            if(b.x == this.x && b.y == this.y){
                return true;
            }
            return false;
        }
        static class PairComparator implements Comparator<Pair>{
            @Override
            public int compare(Pair one, Pair two){
                if(one.x == two.x){
                    if(one.y == two.y){
                        return 0;
                    }
                    return one.y < two.y ? -1:1;
                } else{
                    return one.x < two.x ? -1:1;
                }
            }
        }

    }


    public static long paperCutting(int textLength, List<Integer> starting, List<Integer> ending) {
        int numCuttings = starting.size();
        int[] coverage = new int[textLength + 1];
        long result = 0;

        // For each cutting, mark its coverage range in the coverage array
        for (int i = 0; i < numCuttings; i++) {
            int start = starting.get(i);
            int end = ending.get(i);
            coverage[start]++;
            coverage[end + 1]--;
        }

        // Calculate the total coverage of the cuttings
        for (int i = 1; i <= textLength; i++) {
            coverage[i] += coverage[i - 1];
            if (coverage[i] > 0) {
                result++;
            }
        }

        return result;
    }

    public long paperCuttings(int textLength, List<Integer> starting, List<Integer> ending){
//        long count = 0;
//        if(textLength == 1){
//            return count;
//        }
//        Map<Integer, Pair> map = new HashMap<>();
//        List<Pair> ls = new ArrayList<>();
//
//        int n = starting.size();
//        for(int i=0; i<n; i++){
//            int start = starting.get(i);
//            int end = ending.get(i);
//            Pair newPair = new Pair(start, end);
//            if(!map.containsValue(newPair)) {
//                map.put(i, new Pair(start, end));
//            }
//        }
//
//        // O(n)
//        for(Pair val:map.values()){
//            ls.add(val);
//        }
//
//        Collections.sort(ls, new Pair.PairComparator());
//
//        int size = ls.size();
//        int j=1;
//        for(int i=0; i<size; i++){
//            Pair pair1 = ls.get(i);
////            int y = pair1.y;
////            Pair pair2 = ls.get(j);
//            while(ls.get(j).x < pair1.y){
//                j++;
//            }
////        }
//        int i = 0;
//        while(j < size){
//            Pair pair1 = ls.get(i);
//            Pair pair2 = ls.get(j);
//            if(pair2.x <= pair1.y){
//                j++;
//            } else {
//                count = count + size - j;
//                i++;
//            }
//        }

//        for(int i=0; i<map.size(); i++){
//            for(int j=i+1; j<map.size(); j++){
//                Pair pair1 = map.get(i);
//                Pair pair2 = map.get(j);
//
//                if(pair1.y < pair2.x || pair1.x > pair2.y) {
//                    count++;
//                }
//            }
//
//        }
//        return count;
        long count = 0;
        if(textLength == 1){
            return count;
        }


        // 用set来去重
        Set<Pair> set = new HashSet<>();

        //O(n)
        int n = starting.size();
        for(int i=0; i<n; i++){
            int start = starting.get(i);
            int end = ending.get(i);
            Pair newPair = new Pair(start, end);
            if(!set.contains(newPair)) {
                set.add(newPair);
            }
        }

        //组合的时候我们还是需要有顺序的 → binary search: sorted
        //需要借助ArrayList来排序
        //sort 的思路

        List<Pair> uniqueList = new ArrayList<>(set);
        Collections.sort(uniqueList, new Pair.PairComparator());

        int size = uniqueList.size();
        for(int i=0; i<size-1; i++){
            Pair pairOne = uniqueList.get(i);
            int target = pairOne.y;
            int index = binarySearch(i+1, uniqueList, target+1);
            if(index != -1){
                count = count + size - index;
            }
        }

        return count;

    }
    public int binarySearch(int start, List<Pair> arr, int target)
    {
        int left = start, right = arr.size() - 1;

        while (left < right-1)
        {
            int mid = left + (right - left) / 2;

            if (arr.get(mid).x == target){
                mid--;
                while(mid-1 > 0 && arr.get(mid).x == target){
                    mid --;
                }
                return mid + 1;
            }

            if (arr.get(mid).x < target)
                left = mid + 1;
            else
                right = mid;
        }

        if(arr.get(left).x>target){
            return left;
        }

        if(arr.get(right).x>target){
            return right;
        }
        return -1;
    }

    public static void main(String[] args){
        Test myTest = new Test();
        List<Integer> starting = new ArrayList<>();
        starting.add(26);
        starting.add(49);
        starting.add(28);
        starting.add(10);
        starting.add(41);
        starting.add(83);
        starting.add(84);
        starting.add(1);
        starting.add(32);
        starting.add(20);
        starting.add(13);
        starting.add(74);
        starting.add(1);
        starting.add(3);
        starting.add(11);
        starting.add(5);
        starting.add(4);
        starting.add(74);
        starting.add(36);
        starting.add(14);

        List<Integer> ending = new ArrayList<>();
        ending.add(96);
        ending.add(78);
        ending.add(99);
        ending.add(59);
        ending.add(75);

        ending.add(99);
        ending.add(91);
        ending.add(73);
        ending.add(39);
        ending.add(96);

        ending.add(35);
        ending.add(81);
        ending.add(92);
        ending.add(39);
        ending.add(36);

        ending.add(33);
        ending.add(97);
        ending.add(95);
        ending.add(76);
        ending.add(73);


//        List<Integer> starting = new ArrayList<>();
//        starting.add(1);
//        starting.add(2);
//        starting.add(3);
//
//        List<Integer> ending = new ArrayList<>();
//        ending.add(5);
//        ending.add(2);
//        ending.add(5);


        long res = myTest.paperCuttings(100, starting, ending);
        System.out.println(res);

//        List<Pair> result = new ArrayList<>();
//        result.add(new Pair(1, 4));
//        result.add(new Pair(5, 8));
//        result.add(new Pair(1, 2));
//        result.add(new Pair(3, 5));
//        Collections.sort(result, new Pair.PairComparator());
//        for(Pair pair: result){
//            System.out.println(pair.x);
//            System.out.println(pair.y);
//            System.out.println();
//        }



    }
}
