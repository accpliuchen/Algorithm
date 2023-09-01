package edu.laicode.exercise53;

class TreeNode{
    int value;

    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

public class Test {

    
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }

        if(root.value>key){
            root.left=deleteNode(root.left,key);
            return root;
        }else if(root.value<key){
            root.right=deleteNode(root.right,key);
            return root;
        }

        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }

        if(root.right.left==null){
            root.right.left=root.left;
            return root.right;
        }

        TreeNode smallest=deleteSmallest(root.right);
        smallest.left=root.left;
        smallest.right=root.right;

        return smallest;
    }

    private TreeNode deleteSmallest(TreeNode cur){
        TreeNode prev=cur;
        cur=cur.left;

        while(cur.left!=null){
            prev=cur;
            cur=cur.left;
        }

        prev.left=cur.right;
        return cur;
    }

	public static void main(String args[]){

//		TreeNode root=new TreeNode(3);
//        root.left=new TreeNode(2);
//        root.right=new TreeNode(8);
//        root.right.left=new TreeNode(6);
//        root.right.left.left=new TreeNode(5);
//		root.right.right=new TreeNode(10);
//        root.right.right.right=new TreeNode(12);
//
//        int target=8;


//        TreeNode root=new TreeNode(5);
//        root.left=new TreeNode(3);
//        root.left.left=new TreeNode(2);
//        root.left.right=new TreeNode(4);
//        root.right=new TreeNode(6);
//        root.right.right=new TreeNode(7);
//
//
//        int target=3;

       TreeNode root=new TreeNode(3);
        root.left=new TreeNode(2);

        root.right=new TreeNode(8);
        root.right.right=new TreeNode(12);
        root.right.left=new TreeNode(6);
        root.right.right.left=new TreeNode(11);
        root.right.right.right=new TreeNode(14);

        root.right.right.left.left=new TreeNode(9);
        root.right.right.left.left.right=new TreeNode(10);

        int target=8;

        Test test=new Test();

        TreeNode nodes=test.deleteNode(root,target);

        System.out.println("===");

	}
}