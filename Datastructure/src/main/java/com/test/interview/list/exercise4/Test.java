package com.test.interview.list.exercise4;

import java.util.List;
import java.util.ArrayList;

public class Test {

    public static List<Integer> mergeSortedLists(List<Integer> list1,List<Integer> list2){
        List<Integer> mergedList=new ArrayList<>();
        int i=0,j=0;

        while(i<list1.size() &&  j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }else{
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while(i<list1.size()){
            mergedList.add(list1.get(i));
            i++;
        }

        while(j<list2.size()){
            mergedList.add(list2.get(i));
            j++;
        }

        return mergedList;
    }

    public static void main(String args[]){

        List<Integer> list1=List.of(1,3,5,7,9);
        List<Integer> list2=List.of(2,4,6,8);

        List<Integer> mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }
}
