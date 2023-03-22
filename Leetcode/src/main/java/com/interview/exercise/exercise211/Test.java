package com.interview.exercise.exercise211;

import java.util.HashMap;
import java.util.Map;

class TrieNode{
    Map<Character,TrieNode> children;
    boolean isWord;

    public TrieNode(){
        children=new HashMap<>();
        isWord=false;
    }
}

public class Test {
    private TrieNode root;

    public Test() {
        root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node=root;

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);

            if(!node.children.containsKey(c)){
                node.children.put(c,new TrieNode());
            }

            node=node.children.get(c);
        }
        node.isWord=true;
    }

    public boolean search(String word) {
        return searchHelper(root,word,0);
    }

    public boolean searchHelper(TrieNode node,String word,int index){
        if(index==word.length()){
            return node.isWord;
        }

        char c = word.charAt(index);
        if(c=='.'){
            for(TrieNode children:node.children.values()){
                if(searchHelper(children,word,index+1)){
                    return true;
                }
            }
            return false;
        }else{
            TrieNode child=node.children.get(c);
            if(child==null){
                return false;
            }

            return searchHelper(child,word,index+1);
        }
    }

    public static void main(String args[]){
        Test wordDictionary = new Test();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        wordDictionary.search("pad"); // return False
        wordDictionary.search("bad"); // return True
        wordDictionary.search(".ad"); // return True
        wordDictionary.search("b.."); // return True

    }
}
