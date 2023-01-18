package edu.laicode.exercise51;

class TreeNode{
    int value;

    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class Test {

    public TreeNode insert(TreeNode root, int key) {
        // Write your solution here
        if(root==null){
            return new TreeNode(key);
        }

        if(key<root.value){
            root.left=insert(root.left,key);
        }else if(key>root.value){
            root.right=insert(root.right,key);
        }
        return root;
    }
    
    public static void main(String args[]){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        Test test=new Test();
        TreeNode node=test.insert(root,5);

        System.out.println(node.value);
    }
}
