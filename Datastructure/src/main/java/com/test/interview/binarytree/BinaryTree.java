package com.test.interview.binarytree;

//https://www.jianshu.com/p/4716b2f49e8e
//https://segmentfault.com/a/1190000014743964
//https://www.huaweicloud.com/articles/55ea45147cb52b0275c8d79f2882b3ec.html
import java.util.Stack;

public class BinaryTree {

    private TreeNode  root=null;

    public BinaryTree(){
        root=new TreeNode(1,"rootNode(A)");
    }

    public void createBinTree(TreeNode root){
        TreeNode newNodeB=new TreeNode(2,"B");
        TreeNode newNodeC=new TreeNode(3,"C");
        TreeNode newNodeD=new TreeNode(4,"D");
        TreeNode newNodeE=new TreeNode(5,"E");
        TreeNode newNodeF=new TreeNode(6,"F");

        newNodeC.rightChild = newNodeF;//root.rightChild.rightChild=newNodeF;
        newNodeB.leftChild = newNodeD;//root.leftChild.leftChild=newNodeD;
        newNodeB.rightChild = newNodeE;//root.leftChild.rightChild=newNodeE;

        root.leftChild = newNodeB;
        root.rightChild = newNodeC;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public int size(){
        return size(root);
    }

    public int height(){
        return height(root);
    }

    public void clear(){
      clear(root);
    }

    private void clear(TreeNode node){
        if(node!=null){
            clear(node.leftChild);
            clear(node.rightChild);
            node=null;
        }
    }
    

    private int size(TreeNode subTree){
        if(subTree==null){
            return 0;
        }else{
            return 1+size(subTree.leftChild)+size(subTree.rightChild);
        }
    }

    private int height(TreeNode subTree){
        if(subTree==null)
            return 0;
        else{
            int i = height(subTree.leftChild);
            int j = height(subTree.rightChild);
            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    public void preOrder(TreeNode subTree){
        if(subTree!=null){
            visited(subTree);
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    public void inOrder(TreeNode subTree){
        if(subTree!=null){
            inOrder(subTree.leftChild);
            visited(subTree);
            inOrder(subTree.rightChild);
        }
    }

    public void postOrder(TreeNode subTree){
        if(subTree!=null){
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            visited(subTree);
        }
    }


    public void nonRecPreOrder(TreeNode p){
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode node=p;

        while(node!=null || stack.size()>0){
            while(node!=null){
                visited(node);
                stack.push(node);
                node=node.leftChild;
            }

            while(stack.size()>0){
               node=stack.pop();
               node=node.rightChild;
            }
        }
    }

    //中序遍历的非递归实现
    public void nonRecInOrder(TreeNode p){
        Stack<TreeNode> stack =new Stack<BinaryTree.TreeNode>();
        TreeNode node =p;
        while(node!=null||stack.size()>0){
            //存在左子树
            while(node!=null){
                stack.push(node);
                node=node.leftChild;
            }
            //栈非空
            if(stack.size()>0){
                node=stack.pop();
                visited(node);
                node=node.rightChild;
            }
        }
    }

    //后序遍历的非递归实现
    public void noRecPostOrder(TreeNode p){
        Stack<TreeNode> stack=new Stack<BinaryTree.TreeNode>();
        TreeNode node =p;
        while(p!=null){
            //左子树入栈
            for(;p.leftChild!=null;p=p.leftChild){
                stack.push(p);
            }
            //当前结点无右子树或右子树已经输出
            while(p!=null&&(p.rightChild==null||p.rightChild==node)){
                visited(p);
                //纪录上一个已输出结点
                node =p;
                if(stack.empty())
                    return;
                p=stack.pop();
            }
            //处理右子树
            stack.push(p);
            p=p.rightChild;
        }
    }


    private class TreeNode{
        private int key=0;

        private String data=null;
        private boolean isVisited=false;

        private TreeNode leftChild=null;
        private TreeNode rightChild=null;

        public TreeNode(){}

        public TreeNode(int key,String data){
            this.key=key;
            this.data=data;
            this.leftChild=null;
            this.rightChild=null;
        }


    }

    public void visited(TreeNode subTree){
        subTree.isVisited=true;
        System.out.println("key:"+subTree.key+"--name:"+subTree.data);;
    }


    public static void main(String args[]){
        BinaryTree bt=new BinaryTree();
        bt.createBinTree(bt.root);


        System.out.println("the size of the tree is "+ bt.size());
        System.out.println("the height of the tree is "+ bt.height());

        System.out.println("*******(前序遍历)[ABDECF]遍历*****************");
        bt.preOrder(bt.root);

        System.out.println("*******(中序遍历)[DBEACF]遍历*****************");
        bt.inOrder(bt.root);

        System.out.println("*******(后序遍历)[DEBFCA]遍历*****************");
        bt.postOrder(bt.root);

        System.out.println("***非递归实现****(前序遍历)[ABDECF]遍历*****************");
        bt.nonRecPreOrder(bt.root);

        System.out.println("***非递归实现****(中序遍历)[DBEACF]遍历*****************");
        bt.nonRecInOrder(bt.root);

        System.out.println("***非递归实现****(后序遍历)[DEBFCA]遍历*****************");
        bt.noRecPostOrder(bt.root);
    }
}
