package edu.laicode.exercise58;

import java.util.Deque;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

class TreeNode{
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key){
        this.key=key;
    }
}

public class Test {

    public List<Integer> zigZag(TreeNode root) {
        // Write your solution here
        if(root==null){
            return new LinkedList<Integer>();
        }

        Deque<TreeNode> deque=new LinkedList<TreeNode>();
        List<Integer> list=new LinkedList<Integer>();
        deque.offerFirst(root);
        int layer=0;

        while(!deque.isEmpty()){
            int size=deque.size();

            for(int i=0;i<size;i++){
                if(layer==0){
                    TreeNode tmp=deque.pollLast();
                    list.add(tmp.key);

                    if(tmp.right!=null){
                        deque.offerFirst(tmp.right);
                    }

                    if(tmp.left!=null){
                        deque.offerFirst(tmp.left);
                    }
                }else{

                    TreeNode tmp=deque.pollFirst();
                    list.add(tmp.key);

                    if(tmp.left!=null){
                        deque.offerLast(tmp.left);
                    }

                    if(tmp.right!=null){
                        deque.offerLast(tmp.right);
                    }

                }
            }
            layer=1-layer;
        }

        return list;
    }

    public static void main(String args[]){

        Deque<Integer> queue=new LinkedList<Integer>();
        queue.offerFirst(1);
        queue.offerFirst(2);

        queue.offerLast(3);
        queue.offerLast(4);

        System.out.println("==");

        TreeNode tree=new TreeNode(5);

        tree.left=new TreeNode(3);
        tree.right=new TreeNode(8);

        tree.left.left=new TreeNode(1);
        tree.left.right=new TreeNode(4);

        tree.right.right=new TreeNode(11);

        Test test=new Test();

        List<Integer> result=test.zigZag(tree);

        for(int res:result){
            System.out.print(res);
        }
    }
}
