package com.interview.exercise.exercise380;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;


class RandomizedSet {
   ArrayList<Integer> list;
   HashMap<Integer,Integer> maps;
   Random random;

   public RandomizedSet(){
       list=new ArrayList<Integer>();
       maps=new HashMap<Integer,Integer>();
       random=new Random();
   }


   public boolean insert(int val){
       boolean contain=maps.containsKey(val);

       if(contain) return false;
       maps.put(val,list.size());
       list.add(val);
       return true;
   }

   public boolean remove(int val){
       boolean contain=maps.containsKey(val);

       if(!contain) return false;

       int loc=maps.get(val);

       if(loc<list.size()-1){
            int lastone=list.get(list.size()-1);
            list.set(loc,lastone);
            maps.put(lastone,loc);
       }

       maps.remove(val);
       list.remove(list.size()-1);

       return true;
   }


   public int getRandom(){
       System.out.println(maps.size());
       return  list.get(random.nextInt(maps.size()));
   }
}

public class Test {


    public static void main(String[] args) {

        RandomizedSet randomizedSet=new RandomizedSet();

        randomizedSet.insert(1);
        randomizedSet.remove(2);

        randomizedSet.insert(2);
        int result1=randomizedSet.getRandom();
        System.out.println("result 1  value is "+ result1);


        randomizedSet.remove(1);
        randomizedSet.insert(2);
        int result2 = randomizedSet.getRandom();

        System.out.println("result 2  value is "+ result2);

    }
}
