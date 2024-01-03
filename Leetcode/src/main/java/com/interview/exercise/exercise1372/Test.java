package com.interview.exercise.exercise1372;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){};
    TreeNode(int val){
        this.val=val;
    }

    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }

}

public class Test {


    public int longestZigzag(TreeNode root){
        int[] globalMax=new int[]{0};
        if(root==null) return 0;


        int currentLength=1;
        backTracking(root.left,true,currentLength,globalMax);
        backTracking(root.right,false,currentLength,globalMax);

        return globalMax[0];
    }


    private void backTracking(TreeNode root,boolean isLeft,int currentLength,int[] globalMax){
        if(root==null){
            return ;
        }

        globalMax[0]=Math.max(globalMax[0],currentLength);

        if(isLeft){
            backTracking(root.left,true,1,globalMax);
            backTracking(root.right,false,currentLength+1,globalMax);
        }else{
            backTracking(root.left,true,1+currentLength,globalMax);
            backTracking(root.right,false,1,globalMax);
        }

    }
    
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(1);
        root.right.left=new TreeNode(1);
        root.right.right=new TreeNode(1);

        root.right.right.right=new TreeNode(1);
        root.right.right.left=new TreeNode(1);
        root.right.right.left.right=new TreeNode(1);
        root.right.right.left.right.right=new TreeNode(1);

        Test test=new Test();
        int result=test.longestZigzag(root);
        System.out.println("result value is "+result);
    }
}
