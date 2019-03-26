package com.company;

public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {
    private class TreeNode {
        T value;
        TreeNode left;
        TreeNode right;

        public TreeNode(T value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public BinarySearchTreeImpl() {
        root = null;
    }

    @Override
    public void insert(T t) {
        root = insert(root, t);
    }

    private TreeNode insert(TreeNode root, T t) {
        if (root == null) {
            root = new TreeNode(t);
        } else {
            if (root.value.compareTo(t) >= 0) {
                root.left = insert(root.left, t);
            } else {
                root.right = insert(root.right, t);
            }
        }
        return root;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public void printAll() {
        print(root);
    }

    private void print(TreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.println(root.value);
            print(root.right);
        }
    }

    @Override
    public void printAllByLevels() {

    }
}
