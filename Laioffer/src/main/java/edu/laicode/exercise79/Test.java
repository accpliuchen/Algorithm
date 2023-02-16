package edu.laicode.exercise79;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

    // public String deDup(String input) {
    //     if(input==null || input.length()==0){
    //         return input;
    //     }

    //     char[] array=input.toCharArray();

    //     int end=0;

    //     for(int i=0;i<array.length;i++){
    //         if(i==0 || array[i-1]!=array[i]){
    //             array[end++]=array[i];
    //         }
    //     }


    //     return new String(array,0,end);

    // }


    // public String deDup(String input){
    //     if(input==null || input.length()==0){
    //         return input;
    //     }
    //     Deque<Character> stack=new ArrayDeque();

    //     for(char ch:input.toCharArray()){
    //         if(!stack.contains(ch)){
    //             stack.offerFirst(ch);
    //         }
    //     }

    //     StringBuilder sb=new StringBuilder();
        
    //     int len=stack.size();

    //     for(int i=len-1;i>=0;i--){
    //         sb.append(stack.pollLast());
    //     }

    //     return sb.toString();
    // }
    

    public String deDup(String input){

        if(input==null || input.length()==0){
            return input;
        }

        char[] array=input.toCharArray();

        int end=0;

        for(int i=0;i<array.length;i++){
            if(i==0 || array[i-1]!=array[i]){
                array[end++]=array[i];
            }
        }


        return new String(array,0,end);

    }


    public static void main(String args[]){
        String str="aaaabbbc";
        
        Test test=new Test();
        String result=test.deDup(str);

        System.out.println(result);
    }
}
