package com.interview.exercise.exercise127.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;

public class Test {
    //TC: O(26 * L * n)
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // bfs from start word, change each char and do bfs
        if (wordList == null || wordList.size() == 0) {
            return 0;
        }
        if (beginWord == null || endWord == null) {
            return 0;
        }
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                for (int j = 0; j < cur.length(); j++) {
                    char[] array = cur.toCharArray();
                    for (char k = 'a'; k <= 'z'; k++) {
                        array[j] = k;
                        String newStr = new String(array);
                        if (set.contains(newStr)) {
                            if (newStr.equals(endWord)) {
                                return level + 1;
                            }
                            queue.offer(newStr);
                            set.remove(newStr);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
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
