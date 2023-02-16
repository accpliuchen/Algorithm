package edu.laicode.exercise82.exercise1;

import java.util.Deque;
import java.util.ArrayDeque;

public class Test {


    public String deDup(String input) {
        if(input == null || input.length() <= 1){
            return input;
        }

        char[] array = input.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        int fast = 0;

        while(fast < array.length){
            char curChar = array[fast];
            if(!stack.isEmpty() && stack.peekFirst() == curChar){
                while(fast < array.length && stack.peekFirst() == curChar){

                        //curChar = array[fast];

                    fast ++;

                }
                stack.pollFirst();
            }else{
                stack.offerFirst(curChar);
                fast ++;
            }
        }
        int len = stack.size();
        for(int i=len-1; i >=0; i--){
            array[i] = stack.pollFirst();
        }
        return new String(array, 0, len);
    }



    public static void main(String args[]){
        //String str="abcdddcbba";
        String str="aabccdc";

        Test test=new Test();
        String result=test.deDup(str);

        System.out.println(result);
    }
}
