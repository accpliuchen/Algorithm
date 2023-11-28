package com.interview.exercise.exercise380.exercise2;


import java.util.*;

public class RandomizedSet {

    Map<Integer,Integer> dict;
    List<Integer> list;
    Random rand=new Random();


    public RandomizedSet(){
        dict=new HashMap<>();
        list=new ArrayList<>();
    }

    public boolean insert(int val){

        if(dict.containsKey(val)) return false;

        dict.put(val,list.size());
        list.add(list.size(),val);
        return true;
    }

    public boolean remove(int val){
        if(!dict.containsKey(val)) return false;

        int lastElement=list.get(list.size()-1);
        int idx=dict.get(val);

        list.set(idx,lastElement);
        dict.put(lastElement,idx);

        list.remove(list.size()-1);
        dict.remove(val);
        return true;
    }


    public int getRandom(){
        return list.get(rand.nextInt(list.size()));
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
