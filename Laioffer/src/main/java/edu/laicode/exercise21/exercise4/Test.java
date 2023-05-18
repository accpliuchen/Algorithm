package edu.laicode.exercise21.exercise4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

//    public String removeDuplicate(String str){
//        if(str==null || str.length()==0){
//            return str;
//        }
//
//        int i=0;
//        int j=0;
//        char[] array=str.toCharArray();
//
//        while(i<str.length()){
//            if(j==0 || array[i]!=array[j]){
//                array[j]=array[i];// put element into stack
//                i++;
//                j++;
//            }else{
//                if(i<array.length && array[i]==array[j-1]){
//                    i++;
//                }
//                j--;
//
//            }
//        }
//
//        return new String(array,0,j);
//    }

    public String removeDuplicates(String s) {
        if(s==null || s.length()==0){
            return s;
        }

        Deque<Character> stack=new ArrayDeque<>();

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peekFirst()==ch){
                stack.pollFirst();
            }else{
                stack.offerFirst(ch);
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }

        return sb.toString();
    }
    
    public static void main(String args[]){
        String str="abbac";

        Test test=new Test();
        String result=test.removeDuplicates(str);

        System.out.println(result);
    }
}
