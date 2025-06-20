package org.leetcode.practice.tree;

public class BinarySearchTree {

    public BstNode createBstNode(int data) {

        BstNode newBstNode = new BstNode();

        newBstNode.data=data;
        newBstNode.lchild=null;
        newBstNode.rchild=null;
        return newBstNode;
    }

    public BstNode insertNode(BstNode bstNode, int data) {

        if(bstNode == null) {
            bstNode = createBstNode(data);
        } else if(data < bstNode.data) {
            bstNode.lchild = insertNode(bstNode.lchild,data);
        } else if(data > bstNode.data) {
            bstNode.rchild = insertNode(bstNode.rchild,data);
        }
        return bstNode;
    }

    public void inOrdertraversal(BstNode root) {
        if(root!=null) {
            inOrdertraversal(root.lchild);
            System.out.println(root.data);
            inOrdertraversal(root.rchild);
        } else {
            return;
        }
    }

}
