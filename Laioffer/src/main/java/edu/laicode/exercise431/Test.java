package edu.laicode.exercise431;

import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Test {


    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }

    static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<String> findWords(char[][] board, String[] words) {
        if (board == null || board.length == 0 || board[0] == null || board[0].length == 0 || words == null || words.length == 0) {
            return new ArrayList<>();
        }

        final int rows = board.length;
        final int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        TrieNode root = buildDict(words);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                helper(board, root, sb, set, visited, i, j);
            }
        }

        return new ArrayList<>(set);
    }

    private TrieNode buildDict(String[] words) {
        TrieNode root = new TrieNode();

        for (String word : words) {
            TrieNode cur = root;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                TrieNode next = cur.children[ch - 'a'];

                if (next == null) {
                    next = new TrieNode();

                    cur.children[ch - 'a'] = next;
                }

                cur = next;
            }

            cur.isWord = true;
        }

        return root;
    }

    private void helper(char[][] board, TrieNode root, StringBuilder sb, Set<String> set, boolean[][] visited, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]) {
            return;
        }

        char ch = board[row][col];
        TrieNode cur = root.children[ch - 'a'];

        if (cur == null) {
            return;
        }

        sb.append(ch);
        visited[row][col] = true;

        if (cur.isWord) {
            set.add(sb.toString());
        }

        for (int[] dir : DIRS) {
            int nextRow = row + dir[0];
            int nextCol = col + dir[1];

            helper(board, cur, sb, set, visited, nextRow, nextCol);
        }

        sb.deleteCharAt(sb.length() - 1);
        visited[row][col] = false;
    }

    public static void main(String args[]){
        String[] words = {"oath","pea","eat","rain"};

        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};

        Test test=new Test();


        List<String> result=test.findWords(board,words);

        for(String res:result){
            System.out.println(res);
        }
    }
}
