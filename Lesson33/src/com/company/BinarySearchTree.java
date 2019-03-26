package com.company;

public interface BinarySearchTree<T extends Comparable> {
    void insert(T t);
    boolean contains(T t);
    boolean remove(T t);
    void printAll();
    void printAllByLevels();
}
