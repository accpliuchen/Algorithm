package com.interview.exercise.exercise542;

import java.io.*;
import java.util.*;

class Trie {
    Map<Character, Trie> children = new HashMap<>();
    Set<String> files = new HashSet<>(); // Stores filenames for all words passing through this node
}

public class Solution {
    private Trie root;

    public Solution() {
        this.root = new Trie();
    }

    public void insert(String word, String fileName) {
        Trie current = root;
        for (char l : word.toCharArray()) {
            current = current.children.computeIfAbsent(l, k -> new Trie());
            current.files.add(fileName); // Correctly add the filename here
        }
        // No need to add filename after the loop, as it's already added at each step
    }

    // Search for files by word prefix
    public Set<String> searchFilesByPrefix(String prefix) {
        Trie current = root;
        for (char l : prefix.toCharArray()) {
            if (!current.children.containsKey(l)) {
                return new HashSet<>(); // Prefix not found
            }
            current = current.children.get(l);
        }
        return new HashSet<>(current.files); // Directly return the set of filenames
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example: Insert words and filenames
        solution.insert("Ronald", "FileA");
        solution.insert("Ross", "FileB");
        solution.insert("Dallas", "FileC");

        // Example: Search for files by prefix "Ro"
        Set<String> filesWithPrefixRo = solution.searchFilesByPrefix("Ro");
        System.out.println(filesWithPrefixRo);
    }
}
