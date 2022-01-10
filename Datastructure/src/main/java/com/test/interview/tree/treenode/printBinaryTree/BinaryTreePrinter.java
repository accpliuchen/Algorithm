package com.test.interview.tree.treenode.printBinaryTree;

import java.io.PrintStream;

class BinaryTreeModel {
    private Object value;
    private BinaryTreeModel  left;
    private BinaryTreeModel  right;

    public BinaryTreeModel (Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public BinaryTreeModel  getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeModel  left) {
        this.left = left;
    }

    public BinaryTreeModel  getRight() {
        return right;
    }

    public void setRight(BinaryTreeModel  right) {
        this.right = right;
    }

    public void traversePreOrder(StringBuilder sb, BinaryTreeModel  node) {
        if (node != null) {
            sb.append(node.getValue());
            sb.append("\n");
            traversePreOrder(sb, node.getLeft());
            traversePreOrder(sb, node.getRight());
        }
    }

    public void print(PrintStream os, BinaryTreeModel  node) {
        StringBuilder sb = new StringBuilder();
        traversePreOrder(sb, node);
        os.print(sb.toString());
    }

}

//https://www.baeldung.com/java-print-binary-tree-diagram

public class BinaryTreePrinter{

    private BinaryTreeModel tree;

    public BinaryTreePrinter(BinaryTreeModel tree) {
        this.tree = tree;
    }

    private String traversePreOrder(BinaryTreeModel root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.getValue());

        String pointerRight = "└──";
        String pointerLeft = (root.getRight() != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
        traverseNodes(sb, "", pointerRight, root.getRight(), false);

        return sb.toString();
    }

    private void traverseNodes(StringBuilder sb, String padding, String pointer, BinaryTreeModel node,
                               boolean hasRightSibling) {

        if (node != null) {

            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);

        }

    }

    public void print(PrintStream os) {
        os.print(traversePreOrder(tree));
    }

    public static void main(String args[]){

            BinaryTreeModel   root = new BinaryTreeModel ("root");

            BinaryTreeModel  node1 = new BinaryTreeModel ("node1");
            BinaryTreeModel  node2 = new BinaryTreeModel ("node2");
            root.setLeft(node1);
            root.setRight(node2);

            BinaryTreeModel  node3 = new BinaryTreeModel ("node3");
            BinaryTreeModel  node4 = new BinaryTreeModel ("node4");
            node1.setLeft(node3);
            node1.setRight(node4);

            node2.setLeft(new BinaryTreeModel ("node5"));
            node2.setRight(new BinaryTreeModel ("node6"));

            BinaryTreeModel  node7 = new BinaryTreeModel ("node7");
            node3.setLeft(node7);
            node7.setLeft(new BinaryTreeModel ("node8"));
            node7.setRight(new BinaryTreeModel ("node9"));

            new BinaryTreePrinter(root).print(System.out);

            System.out.println("");
        }
}
