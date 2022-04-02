package com.interview.exercise.exercise676;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class MagicDictionary {
   private Map<String,String> wordsMap=new HashMap<>();
   private Set<String> wordRealSet=new HashSet<>();
   private Set<String> wordShareSet=new HashSet<>();

   public MagicDictionary(){

   }


   public void buildDict(String[] dict){
       for(String word:dict){
            for(int i=0;i<word.length();i++){
                String key = word.substring(0, i) + '_' + word.substring(i + 1, word.length());


                if(wordsMap.containsKey(key)){
                    System.out.println(key);

                    wordShareSet.add(word);
                    wordShareSet.add(wordsMap.get(key));
                }
                wordsMap.put(key,word);
            }
           wordRealSet.add(word);
       }
   }

    public boolean search(String word) {
        if (wordShareSet.contains(word)) {
            return true;
        }
        if (wordRealSet.contains(word)) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            String key = word.substring(0, i) + '_' + word.substring(i + 1, word.length());
            if (wordsMap.containsKey(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MagicDictionary magicDictionary = new MagicDictionary();
        String[] str={"hello","hallo", "leetcode"};
        magicDictionary.buildDict(str);
        magicDictionary.search("hello"); // return False
        magicDictionary.search("hhllo"); // We can change the second 'h' to 'e' to match "hello" so we return True
        magicDictionary.search("hell"); // return False
        magicDictionary.search("leetcoded"); // return False
    }
}
