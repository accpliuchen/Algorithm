package com.interview.exercise.exercise590;


//https://leetcode.com/problems/n-ary-tree-postorder-traversal/discuss/1511448/Java-Iterative-with-Stack-for-children
import java.util.*;

class Node{
    public int val;
    public List<Node> children;

    public Node(){};

    public Node(int val){
        this.val=val;
    }

    public Node(int val,List<Node> children){
        this.val=val;
        this.children=children;
    }
}

public class Test {

//    public List postorder(Node root) {
//        if(root == null) return new LinkedList();
//
//        List list = new LinkedList<>();
//        Stack stack = new Stack<>();
//
//        stack.push(root);
//        while(!stack.isEmpty()){
//            Node candidate = (Node) stack.pop();
//
//            if(candidate.children.size() == 0)
//                list.add(candidate.val);
//
//            else {
//                stack.push(candidate);
//                for(int i = candidate.children.size() - 1; i >= 0; i--){
//                    stack.push(candidate.children.get(i));
//                }
//                candidate.children = new LinkedList<>();
//            }
//        }
//
//        return list;
//    }

    public List<Integer> postorder(Node root) {
        if(root == null) return new LinkedList();

        List<Integer> list = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();

        stack.offerFirst(root);
        while(!stack.isEmpty()){
            Node candidate = stack.pollFirst();

            if(candidate.children.size() == 0)
                list.add(candidate.val);

            else {
                stack.offerFirst(candidate);
                for(int i = candidate.children.size() - 1; i >= 0; i--){
                    stack.push(candidate.children.get(i));
                }
                candidate.children = new LinkedList<>();
            }
        }

        return list;
    }

    public static void main(String args[]){
        Node tree=new Node(1);
        tree.children=new ArrayList<>();

        tree.children.add(new Node(3));
        tree.children.add(new Node(2));
        tree.children.add(new Node(4));

        Node leftNode = tree.children.get(0);
        leftNode.children=new ArrayList<>();
        leftNode.children.add(new Node(5));
        leftNode.children.add(new Node(6));

        Node centerNode = tree.children.get(1);
        centerNode.children=new ArrayList<>();

        Node rightNode = tree.children.get(2);
        rightNode.children=new ArrayList<>();

        Test test=new Test();
        String[] array= (String[]) test.postorder(tree).stream().toArray();


        System.out.println(Arrays.toString(array));

    }
}
