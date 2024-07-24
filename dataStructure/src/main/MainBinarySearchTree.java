package main;

import datastructurenode.BinarySearchTree;

public class MainBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(37);
        myBST.insert(66);
        myBST.insert(42);
        myBST.insert(11);
        myBST.insert(72);
        myBST.insert(8);
        myBST.insert(17);

        myBST.inOrder();
        System.out.println();

        System.out.println(myBST.contains(37));
        System.out.println(myBST.contains(36));
        System.out.println(myBST.contains(66));
        System.out.println(myBST.contains(8));
        System.out.println(myBST.contains(100));
        System.out.println();

        myBST.deleteNode(66);
        myBST.inOrder();


    }
}
