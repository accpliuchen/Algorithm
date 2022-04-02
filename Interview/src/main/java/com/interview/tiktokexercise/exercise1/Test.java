package com.interview.tiktokexercise.exercise1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;


//http://java4programming.blogspot.com/2015/04/1st-try.html
public class Test {

    static void superStack(String[] operations) {

        if (operations.length < 200000 && operations.length > 1) {
            Stack<Integer> stack = new Stack<Integer>();
            for (String operation : operations) {
                if (operation.startsWith("push")) {
                    int k = Integer.parseInt(operation.split(" ")[1]);
                    if (k > 1 && k < 100000) {
                        for (int i = 0; i < k; i++) {

                            stack.push(i + 1);

                        }

                    } else {

                        System.out.println("K out of bound in operation :" + operations);

                        return;

                    }

                } else if (operation.startsWith("pop")) {

                    if (!stack.isEmpty()) {

                        stack.pop();

                    }

                } else if (operation.startsWith("enc")) { // checking for enc operator
                    int e = Integer.parseInt(operation.split(" ")[1]);

                    int k = Integer.parseInt(operation.split(" ")[2]);

                    if (e <= stack.size()) {

                        if (k > 1 && k < 100000) {

                            for (int j = 0; j < e; j++)

                                stack.set(j, stack.get(j) + k);

                        } else {

                            return;

                        }

                    } else {
                        return;

                    }

                }

                //System.out.print("After Operation :'"+operation+"' ");

                if (!stack.isEmpty()) {

                    System.out.println(" Object On Top :" + stack.peek());

                } else {

                    System.out.println("Empty");

                }

            }

        } else {

            System.out.println("Commands out of limit");

        }

    }

//    static void superStack(String[] operations) {
//        if (operations == null || operations.length == 0) {
//            System.out.println("EMPTY");
//            return;
//        }
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < operations.length; i++) {
//            String current = operations[i];
//            if (current.equals("pop")) {
//                list.removeLast();
//            } else {
//                if (current.startsWith("push")) {
//                    list.addLast(Integer.parseInt(current.split(" ")[1]));
//                } else {
//                    int e = Integer.parseInt(current.split(" ")[0]);
//                    int k = Integer.parseInt(current.split(" ")[1]);
//                    ListIterator listIterator = list.listIterator();
//                    int j = 1;
//                    while (listIterator.hasNext()) {
//                        if (j > e)
//                            break;
//                        //listIterator.set(listIterator.next() + k);
//                        int result=Integer.parseInt(listIterator.next().toString())+k;
//                        listIterator.set(result);
//                        j++;
//                    }
//                }
//            }
//            if (list.isEmpty())
//                System.out.println("EMPTY");
//            else
//                System.out.println(list.getLast());
//
//        }
//
//    }


    public static void main(String[] args) {

        String[] str={"push 4","push 5","inc 2 1 ","pop","popo"};

        Test.superStack(str);
    }


}
