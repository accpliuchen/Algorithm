package com.interview.exercise.exercise706;

import java.util.Arrays;

class MyHashMap{
    private final int SIZE=1000001;
    private int[] map;

    public MyHashMap(){
        this.map=new int[this.SIZE];
        Arrays.fill(map,-1);
    }

    public void put(int key,int value){
        map[key]=value;
    }

    public int get(int key){
        return map[key];
    }

    public void remove(int key){
        map[key]=-1;
    }

}

public class Test {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
    }
}
