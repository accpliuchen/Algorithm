package edu.laicode.exercise213.exercise1;

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

    HashMap<Integer,Integer> map;
    public TreeNode reconstruct(int[] inOrder, int[] preOrder) {
        map=new HashMap();
        for(int i=0;i<inOrder.length;i++)
        {
            map.put(inOrder[i],i);
        }
        return build(preOrder,inOrder,0,preOrder.length-1);

    }
    int preIndex;
    public TreeNode build(int[] pre, int[] in,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        TreeNode root=new TreeNode(pre[preIndex++]);
        if(start==end)
        {
            return root;
        }

        root.left=build(pre,in,start,map.get(root.key)-1);
        root.right=build(pre,in,map.get(root.key)+1,end);
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

