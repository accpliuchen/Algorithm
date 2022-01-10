package com.test.interview.tree.treenode.printBinaryTree;

import java.util.List;

public class Test {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos=0;
        int zero=0;
        int neg=0;

        for(int i=0;i<arr.size();i++){
            int value=arr.get(i);

            if(value>0){
                pos++;
            }else if(value<0){
                neg++;
            }else if(value==0){
                zero++;
            }
        }
    }

    public static void main(String args[]){


    }
}
