package com.interview.exercise.exercise127;

import java.util.*;

//https://blog.csdn.net/qq_41231926/article/details/81545756
public class Test {


    public int ladderLength(String beginWord,String endWord,List<String> wordList){
        Set<String> set=new HashSet<>();

        if(!wordList.contains(endWord)){
            return 0;
        }

        Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        set.add(beginWord);
        int count=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            count++;

            for(int i=0;i<size;i++){
                String temp=queue.poll();

                if(temp.equals(endWord)){
                    return count;
                }

                for(String word:wordList){
                    if(checkDiffByOne(temp,word) && !set.contains(word)){
                        queue.offer(word);
                        set.add(word);
                    }
                }
            }

        }
        return 0;
    }

    public boolean checkDiffByOne(String temp,String word){
        int len=temp.length();
        int count=0;

        for(int i=0;i<len;i++){
            if(temp.charAt(i)!=word.charAt(i)){
                count++;
            }
        }
        return count==1?true:false;
    }


    public static void main(String args[]){
        String beginWord="hit";
        String endWord="cog";

        //"hot","dot","dog","lot","log","cog"
        List wordList=new ArrayList();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        Test test=new Test();
        int result=test.ladderLength(beginWord,endWord,wordList);

        System.out.println("result value is "+result);

    }
}
