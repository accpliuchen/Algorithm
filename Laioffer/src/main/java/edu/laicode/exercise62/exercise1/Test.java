package edu.laicode.exercise62.exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test {

    public List<String> subSets(String set) {
        // Write your solution here.
        List<String> result=new ArrayList<String>();

        if(set==null){
            return result;
        }

        char[] arraySet=set.toCharArray();
        StringBuilder sb=new StringBuilder();

        helper(arraySet,sb,0,result);
        return result;
    }

    private void helper(char[] set,StringBuilder sb,int index,List<String> result){
        if(index==set.length){
            result.add(sb.toString());
            return;
        }

        sb.append(set[index]);
        helper(set,sb,index+1,result);
        sb.deleteCharAt(sb.length()-1);
        helper(set,sb,index+1,result);
    }

    public static void main(String args[]){
        String str="abc";

        Test test=new Test();
        List<String> set=test.subSets(str);

        for(String array:set){
            System.out.println(array);
        }
    }
}
