package edu.laicode.exercise213;

import java.util.Map;
import java.util.HashMap;

class TreeNode {
     public int key;
     public TreeNode left;
     public TreeNode right;
     public TreeNode(int key) {
        this.key = key;
     }
 }
 
public class Test {

   public TreeNode reconstruct(int[] inOrder, int[] preOrder) {
      	Map<Integer, Integer> inIndex = new HashMap<>();

	    for (int i = 0; i < inOrder.length; ++i) {
	      inIndex.put(inOrder[i], i);
	    }

    	return helper(preOrder, 0, inOrder.length - 1, 0, preOrder.length - 1, inIndex);
   }

   private TreeNode helper(int[] preOrder, int inLeft, int inRight, int preLeft, int preRight, Map<Integer, Integer> inIndex) {
    if (inLeft > inRight) {
      return null;
    }

    TreeNode root = new TreeNode(preOrder[preLeft]);
    int rootIndex = inIndex.get(preOrder[preLeft]);

    root.left = helper(preOrder, inLeft, rootIndex - 1, preLeft + 1, preLeft + rootIndex - inLeft, inIndex);
    root.right = helper(preOrder, rootIndex + 1, inRight, preLeft + rootIndex - inLeft + 1, preRight, inIndex);

    return root;
  }


  public static void main(String args[]){
  	int[] inOrder=new int[]{1, 3, 4, 5, 8, 11};
  	int[] preOrder=new int[]{5, 3, 1, 4, 8, 11};

  	Test test=new Test();
  	TreeNode root=test.reconstruct(inOrder,preOrder);

  	System.out.println("===");

  }

}
