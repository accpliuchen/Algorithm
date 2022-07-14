package edu.laicode.exercise49;


class TreeNode{
    public int key;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int key) {
      this.key=key;
    }
}
public class Test {
    
    public boolean isIndentical(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left ==null || right==null){
            return false;
        }else if(left.key!=right.key){
            return false;
        }else{
            return isIndentical(left.left,right.left) && isIndentical(left.right,right.right);
        }
    }

    public static void main(String arg[]){

    }
}
