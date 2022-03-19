package com.interview.exercise.exercise946;

import java.util.Stack;

public class Test {

    public boolean validateStackSequences(int[] pushed,int[] popped){
//        if(null ==pushed || null==popped){
//            return  false;
//        }
//
//        Stack<Integer> stack=new Stack<>();
//        int pos=0;
//
//        //for(int i:pushed){
//        for(int i=0;i<pushed.length;i++){
//            stack.push(i);
//
//            while(!stack.isEmpty() && popped[pos]==stack.peek()){
//                stack.pop();
//                pos++;
//            }
//        }
//
//        return stack.isEmpty();


        if(pushed==null || popped ==null)
            return false;

        Stack<Integer> stack=new Stack<Integer>();
        int pos=0;

        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);

            while(!stack.isEmpty() && popped[pos]==stack.peek()){

                System.out.println("popped[pos] value is "+ popped[pos]);
                System.out.println("stack.peek() value is "+ stack.peek());
                stack.pop();
                pos++;
            }
            System.out.println("\n");
        }


        return stack.isEmpty();

    }


    public static void main(String args[]){
        int[] pushed={1,2,3,4,5};
        int[] popped={4,5,3,2,1};


//        Stack<Integer> stack=new Stack<Integer>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.print(stack.peek());

        Test test=new Test();
        System.out.println(test.validateStackSequences(pushed,popped));
    }
}
