package com.interview.exercise.exercise30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Test {

    public List<Integer> findSubString(String s,String[] words){
        List<Integer> res=new ArrayList<>();

        if(s==null || s.length()==0 || words==null || words.length==0)
            return res;

        HashMap<String,Integer> map=new HashMap<>();

        int one_word=words[0].length();
        int word_num=words.length;

        int all_len=one_word*word_num;

        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }


        for (int i = 0; i < s.length()-all_len+1; i++) {
            String str = s.substring(i, i + all_len);
            HashMap<String, Integer> strMap = new HashMap<>();
            for (int j = 0; j < str.length() - one_word + 1; j += one_word) {
                String wor = str.substring(j, j + one_word);
                strMap.put(wor, strMap.getOrDefault(wor, 0) + 1);
            }
            if (map.equals(strMap)) res.add(i);
        }
            return res;
    }



    public static  void main(String args[]){
        String s="barfoothefoobarman";
        String[] str={"foo","bar"};

        Test test=new Test();
        List<Integer>  result= test.findSubString(s,str);

        System.out.println("============="+result);

    }
}
