package com.test.interview.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {



    public static void main(String args[]){
        LRUCache cache = new LRUCache(5);
        cache.put("1", "1");
        cache.put("2", "2");
        cache.put("3", "3");
        cache.put("4", "4");
        cache.put("5", "5");


        System.out.println("Init：");
        System.out.println(cache.keySet());
        System.out.println("visit 3：");
        cache.get("3");
        System.out.println(cache.keySet());

        System.out.println("visit 2：");
        cache.get("2");
        System.out.println(cache.keySet());

        System.out.println("adding data 6,7：");
        cache.put("6","6");
        cache.put("7","7");

        System.out.println(cache.keySet());
    }
}

class LRUCache extends LinkedHashMap{
    private static final long serialVersionUID = 1L;

    private int cacheSize;

    public LRUCache(int cacheSize){
        super(10,0.75f,true);
        this.cacheSize=cacheSize;
    }


    protected  boolean removeEldestEntry(Map.Entry eldest){
        boolean r=size()>cacheSize;

        if(r){
            System.out.println("clear cache key："+eldest.getKey());
        }

        return r;
    }
}
