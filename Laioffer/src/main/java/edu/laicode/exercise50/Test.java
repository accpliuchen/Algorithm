package edu.laicode.exercise50;


class TreeNode {
  public int key;
  public TreeNode left;
  public TreeNode right;
  public TreeNode(int key) {
     this.key = key;
   }
 }

public class Test {

//	public boolean isTweakedIdentical(TreeNode one, TreeNode two) {
//		if(one==null && two==null){
//			return true;
//		}else if(one==null || two==null){
//			return false;
//		}else if(one.key!=two.key){
//			return false;
//		}else{
//			return (isTweakedIdentical(one.left,two.right) && isTweakedIdentical(one.right,two.left)) || (isTweakedIdentical(one.left,two.left) && isTweakedIdentical(one.right,two.right));
//		}
//	}

  //recursion
	// public boolean isTweakedIdentical(TreeNode one,TreeNode two){
	// if(one==null && two==null){
 //      return true;
 //    }

 //    if(one==null || two==null){
 //      return false;
 //    }

 //    boolean isIndentical = isTweakedIdentical(one.left,two.left) && isTweakedIdentical(one.right,two.right);
 //    boolean isSymmetric  = isTweakedIdentical(one.left,two.right) && isTweakedIdentical(one.right,two.left);

 //    if((!isIndentical && !isSymmetric) || one.key!=two.key){
 //      return false;
 //    }
 //    return true;
	// }

	//DFS

	public boolean isTweakedIdentical(TreeNode one,TreeNode two){
	  if(one==null && two==null){
      return true;
    }

    if(one==null || two==null){
      return false;
    }

    if(one.key!=two.key){
    	return false;
    }

    return isTweakedIdentical(one.left,two.left) && isTweakedIdentical(one.right,two.right) || isTweakedIdentical(one.left,two.right) && isTweakedIdentical(one.right,two.left);
	}


	public static void main(String args[]){

		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.right=new TreeNode(8);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(4);


//		TreeNode second=new TreeNode(5);
//		second.left=new TreeNode(8);
//		second.right=new TreeNode(3);
//		second.right.left=new TreeNode(1);
//		second.right.right=new TreeNode(4);

		TreeNode second=new TreeNode(5);
		second.left=new TreeNode(3);
		second.right=new TreeNode(8);
		second.left.left=new TreeNode(1);
		second.left.right=new TreeNode(4);

		Test test=new Test();
		boolean result=test.isTweakedIdentical(root,second);

		System.out.println("result value is "+ result);

	}
}
