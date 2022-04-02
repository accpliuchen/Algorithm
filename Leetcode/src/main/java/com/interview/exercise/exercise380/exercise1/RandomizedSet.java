package com.interview.exercise.exercise380.exercise1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    ArrayList<Integer> numList;
    HashMap<Integer,Integer> map;
    Random random;

    public RandomizedSet(){
        numList=new ArrayList<Integer>();
        map=new HashMap<Integer,Integer>();
        random=new Random();
    }

    public boolean insert(int val){
        boolean contain=map.containsKey(val);

        if(contain) return false;
        map.put(val,numList.size());
        numList.add(val);

        return true;
    }

    public boolean remove(int val){
        boolean contain=map.containsKey(val);

        if(!contain) return false;

        int loc=map.get(val);
        if(loc<numList.size()-1){
            int lastone=numList.get(numList.size()-1);
            numList.set(loc,lastone);
            map.put(lastone,loc);
        }


        map.remove(val);
        numList.remove(numList.size()-1);

        return true;
    }

    public int getRandom(){
        return numList.get(random.nextInt(map.size()));
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
        randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
        //randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
        System.out.println("result 1  value is "+ randomizedSet.getRandom());

        randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
        randomizedSet.insert(2); // 2 was already in the set, so return false.
        //randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.

        System.out.println("result 2  value is "+ randomizedSet.getRandom());
    }
}