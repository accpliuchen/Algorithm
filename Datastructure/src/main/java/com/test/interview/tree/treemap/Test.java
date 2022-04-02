package com.test.interview.tree.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();

        treeMap.put(1, " A ");
        treeMap.put(2, " B ");
        treeMap.put(3, " C ");
        treeMap.put(4, " E ");
        treeMap.put(5, " D ");

        System.out.println("Ceiling key entry for 10: "+treeMap.ceilingKey(3));// return null

        //throw exception java.lang.NullException
//        try{
//            System.out.println("Ceiling key entry for null value : "
//                    + treeMap.ceilingKey(null));
//
//        }catch(Exception e){
//            System.out.println("Exception : "+e);
//        }

        NavigableMap<Integer, String> treemap = new TreeMap<Integer, String>();

        treemap.put(2, "two");
        treemap.put(1, "one");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(5, "five");

        System.out.println("Ceiling key entry for 4: "+ treemap.ceilingKey(4)); //return 5
        System.out.println("Ceiling key entry for 5: "+ treemap.ceilingKey(5)); //return 5
        System.out.println("Ceiling key entry for 7: "+ treemap.ceilingKey(7)); //return null


        Map<String,Integer> map=new TreeMap<>();
        map.put("organe",1);
        map.put("organe",1);
        map.put("organe",1);


    }
}
