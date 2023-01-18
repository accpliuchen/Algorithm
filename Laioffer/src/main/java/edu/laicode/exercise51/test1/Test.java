package edu.laicode.exercise51.test1;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int value;

    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class Test {

//    public TreeNode insert(TreeNode root, int key) {
//        if(root==null){
//            return new TreeNode(key);
//        }
//
//
//    }



    public List<Integer> preOrder(TreeNode root) {
        // Write your solution here
        List<Integer> ls = new ArrayList<>();

        if(root == null) return null;
        else{
            ls.add(new Integer(root.value));
            List<Integer> l1 = preOrder(root.left);
            List<Integer> l2 = preOrder(root.right);
        
            if(l1!=null)
            ls.addAll(l1);

            if(l2!=null)
            ls.addAll(l2);
        }
        return ls;


    }

    public static void main(String args[]){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        Test test=new Test();

        System.out.println(test.preOrder(root));
        
//        TreeNode node=test.insert(root,5);
//
//        System.out.println(node.value);
    }
}
