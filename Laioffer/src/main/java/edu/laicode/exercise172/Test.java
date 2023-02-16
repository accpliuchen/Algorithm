package edu.laicode.exercise172;

public class Test {

    public String replace(String input, String source, String target) {
        // Write your solution here
        StringBuilder sb=new StringBuilder();

        int fromIndex=0;
        int matchIndex=input.indexOf(source,fromIndex);

        while(matchIndex!=-1){
            sb.append(input,fromIndex,matchIndex).append(target);
            fromIndex=matchIndex+source.length();
            matchIndex=input.indexOf(source,fromIndex);
        }

        sb.append(input,fromIndex,input.length());

        return sb.toString();
    }

    public static void main(String args[]){
        String input="appledogapple";
        String source="apple";
        String target="cat";

        Test test=new Test();
        String result=test.replace(input,source,target);

        System.out.println(result);

    }
}
