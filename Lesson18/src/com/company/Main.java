package com.company;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.setValue(2);
        Node n2 = new Node();
        n2.setValue(3);
        Node n3 = new Node();
        n3.setValue(7);
        n1.setNext(n2);
        n2.setNext(n3);
        Node current = n1;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}










