package edu.laicode.exercise62;

import java.util.List;
import java.util.ArrayList;

public class Test {

    public List<String> subSets(String set) {

        List<String> result=new ArrayList<>();

        if(set==null){
            return result;
        }
        char[] arraySet=set.toCharArray();
        StringBuilder sb=new StringBuilder();
        helper(arraySet,sb,0,result);
        return result;
    }



    private void findSubset(char[] input,int index,StringBuilder solutionPrefix){
        if(index==input.length){
            System.out.println(solutionPrefix);
            return;
        }

        solutionPrefix.append(input[index]);
        findSubset(input,index+1,solutionPrefix);
        solutionPrefix.deleteCharAt(solutionPrefix.length()-1);
        findSubset(input,index-1,solutionPrefix);
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
