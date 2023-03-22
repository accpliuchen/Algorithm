package edu.laicode.exercise586;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;

        public TrieNode() {
            children = new HashMap();
            endOfWord = false;
        }
    }

    TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode current = root;
        for (Character c : word.toCharArray()) {
            TrieNode node = current.children.get(c);
            if (node == null) {
                node = new TrieNode();
                current.children.put(c, node);
            }
            current = node;
        }
        current.endOfWord = true;
    }

    public String getRootWord(String word) {
        if (root.children.get(word.charAt(0)) == null)
            return word;

        TrieNode current = root;
        StringBuilder sb = new StringBuilder("");
        for (Character c : word.toCharArray()) {
            TrieNode node = current.children.get(c);
            sb.append(c);
            if (node == null)
                return word;
            else if (node != null && node.endOfWord) {
                return sb.toString();
            } else {
                current = node;
            }
        }
        return word;
    }

    public String replaceWords(List<String> prefixes, String sentence) {
        // Write your solution here

        for(int i=0;i<prefixes.size();i++){
            insert(prefixes.get(i));
        }

        //iterate through all the words in sentence and check if smallest prefix root exist or not
        String[] sent = sentence.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < sent.length; i++) {
            sb.append(getRootWord(sent[i])).append(" ");
        }

        return sb.toString().trim();

    }


     public static void main(String args[]){
     	String[] words = {"pro", "program", "de", "re"};   

		List<String> wordList = Arrays.asList(words);

        String sentence = "if debugging is the process of removing bugs programming must be the process of putting them in";

        Test test=new Test();
        String result=test.replaceWords(wordList,sentence);

        System.out.println(result);
     }
}
