//package com.interview.exercise.exercise68.exercise1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Test {
//
//    public List<String> fullJustify(String[] words,int maxWidth){
//        List<String> ans=new ArrayList<>();
//
//        int i=0;
//
//        while(i<words.length){
//            List<String> currentLine=getWords(i,words,maxWidth);
//            i+=currentLine.size();
//            //System.out.println(createLine(currentLine,i,words,maxWidth).length());
//            ans.add(createLine(currentLine,i,words,maxWidth));
//        }
//
//        return ans;
//    }
//
//    //O(n*k)
//    private String createLine(List<String> line, int i, String[] words, int maxWidth) {
//        int baseLength = -1;
//        for (String word: line) {
//            baseLength += word.length() + 1;
//        }
//
//
//        int extraSpaces = maxWidth - baseLength;
//
//        // worse time O(n)
//        if (line.size() == 1 || i == words.length) {
//            return String.join(" ", line) + " ".repeat(extraSpaces);
//        }
//
//        int wordCount = line.size() - 1;
//        int spacesPerWord = extraSpaces / wordCount;
//        int needsExtraSpace = extraSpaces % wordCount;
//
//        for (int j = 0; j < needsExtraSpace; j++) {
//            line.set(j, line.get(j) + " ");
//        }
//
//        for (int j = 0; j < wordCount; j++) {
//            //System.out.println( (line.get(j) + " ".repeat(spacesPerWord)).length());
//
//            line.set(j, line.get(j) + " ".repeat(spacesPerWord));
//        }
//
//        //System.out.println(String.join(" ",  line).length());
//        return String.join(" ",  line);
//    }
//
//    //O(n)
//    private List<String> getWords(int i,String[] words,int maxWidth){
//        List<String> currentLine=new ArrayList<>();
//        int currLength=0;
//
//        while(i<words.length && currLength+words[i].length() <= maxWidth){
//            currentLine.add(words[i]);
//            currLength+=words[i].length()+1;
//            i++;
//        }
//
//        return currentLine;
//    }
//
//    public static void main(String args[]){
//
//        String[] words =new String[]{"This", "is", "an", "example", "of", "text", "justification."};
//        //String[] words =new String[]{"what", "must", "be", "acknowledgment", "shall", "be"};
//        int maxWidth = 16;
//
//        Test test=new Test();
//        List<String> result=test.fullJustify(words,maxWidth);
//
//        System.out.println(result);
//
//    }
//}
