package com.interview.exercise.exercise599;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

//    public String[] findRestaurant(String[] list1, String[] list2) {
//        Map<String,Integer>  map=new HashMap<>();
//        for(int i=0;i< list2.length;i++){
//            map.put(list2[i],i);
//        }
//
//        int minIndexSum=Integer.MAX_VALUE;
//        List<String> common=new ArrayList<>();
//
//        for(int i=0;i<list1.length;i++){
//            Integer j=map.get(list1[i]);
//            if(j!=null && i+j<minIndexSum){
//                minIndexSum=i+j;
//
//                common.clear();
//            }
//            common.add(list1[i]);
//        }
//
//        return common.toArray(new String[common.size()]);
//    }

    public String[] findRestaurant(String[] list1,String[] list2){
        Map<String,Integer> map=new HashMap<>();
        List<String> result=new ArrayList<>();

        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int sum=map.get(list2[i])+i;

                if(sum<minSum){
                    result.clear();
                    result.add(list2[i]);
                    minSum=sum;
                }else if(sum==minSum){
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String args[]){
        String[] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

//        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
//        String[] list2 = {"KFC","Shogun","Burger King"};

        Test test=new Test();
        String[] result=test.findRestaurant(list1,list2);

        for(String str:result){
            System.out.println(str);
        }
    }
}
