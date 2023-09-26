package com.interview.exercise.exercise1668;

public class Test {

    public int maxRepeating(String sequence,String word){
        int repeating=0;

        StringBuilder sb=new StringBuilder(word);

        while(sequence.contains(sb)){
            repeating++;
            sb.append(word);
        }

        return repeating;
    }


    public static void main(String args[]){
        String sequence="ababc";
        String word="ab";

        Test test=new Test();

        int result= test.maxRepeating(sequence,word);

        System.out.println(result);
    }
}
