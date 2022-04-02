package com.interview.exercise.exercise71;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Test {

//    public String simplifyPath(String path) {
//        Deque<String> stack = new ArrayDeque<>();
//        for (String token : path.split("/")) {
//            if (token.length() == 0 || token.equals(".")) continue;
//            if (token.equals("..")) {
//                if (stack.size() > 0) stack.pop();
//            } else {
//                stack.push(token);
//            }
//        }
//
//        StringBuilder builder = new StringBuilder();
//        builder.append("/");
//        while (stack.size() > 0) {
//            builder.append(stack.removeLast());
//            if (stack.size() > 0) builder.append("/");
//        }
//        return builder.toString();
//    }

    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] arr=path.split("/");

        for(int i=0;i<arr.length;i++){
            String curr=arr[i].trim();

            if(curr==null || curr.length()==0 || curr.equals(".")) continue;

            if(curr.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }else{
                stack.push(curr);
            }
        }

        String res="";

        while(!stack.isEmpty()){
            res="/"+stack.pop()+res;
        }

        return res.length()==0?"/":res;
    }

    public static  void main(String args[]){

//        String path="/home/";

        String path="/../";

        Test test=new Test();
        String result=test.simplifyPath(path);


        System.out.println("result value "+ result);

        String paths="/home/";

        String[] ass=path.split("/");
        System.out.println(ass.length);
    }
}
