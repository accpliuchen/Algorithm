package edu.laicode.exercise57;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
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

   public List<List<Integer>> layerByLayer(TreeNode root){
        List<List<Integer>> list=new ArrayList<List<Integer>>();

        if(root==null){
        	return list;
        }

        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()){
           List<Integer> curLayer=new ArrayList<Integer>();

           int size=queue.size();

           for(int i=0;i<size;i++){
           	TreeNode cur=queue.poll();

           	curLayer.add(cur.key);

           	if(cur.left!=null){
           		queue.offer(cur.left);
           	}

           	if(cur.right!=null){
           		queue.offer(cur.right);
           	}
           }

           list.add(curLayer);
        }

        return list;
   }

   public static void main(String args[]){
      TreeNode tree=new TreeNode(5);

      tree.left=new TreeNode(3);
      tree.right=new TreeNode(8);

      tree.left.left=new TreeNode(1);
      tree.left.right=new TreeNode(4);

      tree.right.right=new TreeNode(11);

      Test test=new Test();
      List<List<Integer>> result=test.layerByLayer(tree);
      
      for(List list:result){
      	for(Object listint:list){
      		System.out.print(listint);
      	}
      }
   }
}
