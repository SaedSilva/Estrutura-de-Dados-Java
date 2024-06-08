package main;

import datastructure.Tree;

public class MainTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);


        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);
        System.out.println(tree.root.isLeaf());
        System.out.println(tree.root.right.isLeaf());
        System.out.println();

        tree.preOrder();
        System.out.println();

        tree.inOrder();
        System.out.println();

        tree.posOrder();
        System.out.println();

        tree.bfs();
        System.out.println();
    }
}
