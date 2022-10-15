package com.interview.exercise.exercise981;


import java.util.*;

public class Test {

    private final Map<String, TreeMap<Integer, String>> store;

    public Test() {
        store = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!store.containsKey(key))
            store.put(key, new TreeMap<>());

        store.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeMap = store.get(key);
        if (treeMap == null)
            return "";

        Integer floorKey = treeMap.floorKey(timestamp);
        if (floorKey == null)
            return "";

        return treeMap.get(floorKey);
    }

	public static void main(String args[]){
		Test timeMap = new Test();
		timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
		timeMap.get("foo", 1);         // return "bar"
		timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
		timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
		timeMap.get("foo", 4);         // return "bar2"
		timeMap.get("foo", 5);         // return "bar2"
	}
}
