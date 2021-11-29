package com.interview.exercise.exercise105;


import sun.reflect.generics.tree.Tree;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    ;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Test {
    private int preStart = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return recursion(preorder, inorder, 0, preorder.length - 1);
        return recursion(preorder, inorder,0, 0, inorder.length - 1);
    }

//    private TreeNode recursion(int[] preorder, int[] inorder, int left, int right) {
//        if (preStart == preorder.length || left > right) {
//            return null;
//        }
//
//        TreeNode root = new TreeNode(preorder[preStart]);
//
//        for (int i = left; i <= right; i++) {
//            if (preorder[preStart] == inorder[i]) {
//                preStart++;
//
//                root.left = recursion(preorder, inorder, left, i - 1);
//                root.right = recursion(preorder, inorder, i + i, right);
//                break;
//            }
//        }
//        return root;
//
//    }

    private TreeNode recursion(int[] preorder, int[] inorder, int preStart, int start, int end) {
       if(preStart> preorder.length-1 || start>end) return null;

       TreeNode root=new TreeNode(preorder[preStart]);
       int index=0;

       for(int i=start;i<=end;i++){
           if(root.val==inorder[i]){
               index=i;
               break;
           }
        }

        root.left = recursion(preorder, inorder, preStart+1, start, index-1);
        root.right = recursion(preorder, inorder, preStart+index-start+1,index+1,end);

        return root;
    }


    public static void main(String args[]) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
    }
}
