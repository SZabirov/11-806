package com.company;

public class IntLinkedList {
    private Node head;
    private int count = 0;

    //добавление в конец списка
    public void add(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        newNode.setNext(null);
        if (head != null) {
            Node current = head;
            //нахождение последнего из списка
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException(index + " does not exist");
        }
        Node elem = head;
        for (int i = 0; i < index; i++) {
            elem = elem.getNext();
        }
        return elem.getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException(index + " does not exist");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node beforeRemovable = head;
            for (int i = 0; i < index - 1; i++) {
                beforeRemovable = beforeRemovable.getNext();
            }
            Node elemToRemove = beforeRemovable.getNext();
            beforeRemovable.setNext(elemToRemove.getNext());
        }

    }


}
