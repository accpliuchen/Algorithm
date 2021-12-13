package com.test.interview.binarytree;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/deletion-binary-tree/
public class BinaryTreeDeletion {


    static class Node{
        int key;
        Node left,right;

        Node(int key){
            this.key=key;
            left=null;
            right=null;
        }
    }

    static Node root;
    static Node temp=root;

    static void inorder(Node temp){
        if(temp==null)
            return ;

        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }

    static  void deleteDeepest(Node root, Node delNode){

        Queue<Node> q=new LinkedList<Node>();
        q.add(root);

        Node temp=null;

        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();

            if(temp==delNode){
                temp=null;
                return ;
            }

            if(temp.right!=null){
                if(temp.right==delNode){
                    temp.right=null;
                    return;
                }
            }else{
                q.add(temp.right);
            }
            if (temp.left!=null){
                if(temp.left==delNode){
                    temp.left=null;
                    return ;
                }else{
                    q.add(temp.left);
                }
            }
        }
    }


    static void delete(Node root, int key){

        if(root ==null){
            return;
        }

        if(root.left==null &&  root.right==null){
            if (root.key == key)
            {
                root=null;
                return;
            }
            else
                return;
        }
    }

}
