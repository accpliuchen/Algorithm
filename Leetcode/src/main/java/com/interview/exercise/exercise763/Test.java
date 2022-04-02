package com.interview.exercise.exercise763;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<Integer> partitionLabels(String str) {

        if(str==null || str.length()==0) return null;

        List<Integer> output_arr=new ArrayList<>();
        int[] last_indices=new int[26];
        for(int i=0;i<str.length();i++){

            System.out.println("i value is " +i +"  str value is "+ str +"=============="+str.charAt(i)+"========="+(str.charAt(i)-'a'));

            last_indices[str.charAt(i)-'a']=i;
        }

        int start=0;
        int end=0;

        for(int i=0;i<str.length();i++){
            end = Math.max(end,last_indices[str.charAt(i)-'a']);
            if(i==end){
                output_arr.add(end-start+1);
                start=end+1;
            }
        }


        return output_arr;
    }

    public static void main(String[] args) {
        String str = "ababcbacadefegdehijhklij";

        Test test=new Test();

        List<Integer> result=test.partitionLabels(str);

        for(Integer nums:result){
            System.out.println(nums);
        }


        char c='b';
        System.out.println(c-'a');
    }
}
