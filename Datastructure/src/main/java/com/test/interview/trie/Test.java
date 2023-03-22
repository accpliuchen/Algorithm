package com.test.interview.trie;

import java.util.Map;
import java.util.HashMap;

class TrieNode{
    Map<Character,TrieNode> children;
    boolean isWord;
    int value;
    int count;
}

public class Test {
    private TrieNode root;

    public Test(){
        root = new TrieNode();
    }

//    public boolean insert(String word){
//    TrieNode cur=root;
//        for(int i=0;i<word.length();i++){
//            TrieNode next=cur.children.get(word.chatAt(i));
//            if(next==null){
//                  next=new TrieNode();
//                  cur.children.put(word.charAt(i),next);
//            }
//            cur=next;
//            cur.count++;
//        }
//        cur.isWord=true;
//        return true;
//
//    }

    public static void main(String args[]){

    }
}
