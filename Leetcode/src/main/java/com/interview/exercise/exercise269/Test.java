package com.interview.exercise.exercise269;

import java.util.*;

public class Test {

    public String alienOrder(String[] words){
        Map<Character,List<Character>> adjList=new HashMap<>();
        Map<Character,Integer> counts=new HashMap<>();

        for(String word:words){
            for(char c:word.toCharArray()){
                counts.put(c,0);
                adjList.put(c,new ArrayList<>());
            }
        }

        for(int i=0;i<words.length-1;i++){
            String words1=words[i];
            String words2=words[i+1];

            if(words1.length()>words2.length() && words1.startsWith(words2)){
                return "";
            }


            for(int j=0;j<Math.min(words1.length(),words2.length());j++){
                if(words1.charAt(j)!=words2.charAt(j)){
                    adjList.get(words1.charAt(j)).add(words2.charAt(j));
                    counts.put(words2.charAt(j),counts.get(words2.charAt(j))+1);
                    break;
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        Queue<Character> queue=new LinkedList<>();

        for(Character c:counts.keySet()){
            if(counts.get(c).equals(0)){
                queue.add(c);
            }
        }

        while(!queue.isEmpty()){
           Character c=queue.remove();
           sb.append(c);

           for(Character next:adjList.get(c)){
               counts.put(next,counts.get(next)-1);

               if(counts.get(next).equals(0)){
                   queue.add(next);
               }

           }
           
        }

        if(sb.length()<counts.size()) {
            return "";
        }


        return sb.toString();
    }

    public static void main(String args[]){
        String[] words=new String[]{"wrt","wrf","er","ett","rftt"};

        Test test=new Test();

        String result=test.alienOrder(words);

        System.out.println(result);

    }
}
