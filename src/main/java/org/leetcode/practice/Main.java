package org.leetcode.practice;

import org.leetcode.practice.tree.BinarySearchTree;
import org.leetcode.practice.tree.BstNode;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree BST = new BinarySearchTree();

        BstNode rootNode = new BstNode();
        rootNode = null;

        rootNode = BST.insertNode(rootNode,5);
        rootNode = BST.insertNode(rootNode,3);
        rootNode = BST.insertNode(rootNode,1);

        BST.inOrdertraversal(rootNode);

    }
}