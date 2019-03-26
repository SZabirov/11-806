package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<>();
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.printAll();
    }
}
