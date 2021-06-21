package com.anderson.datastructures;

import java.util.Iterator;

public class QueueUsingLinkedList<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;
    public QueueUsingLinkedList() {
        N = 0;
    }
    public Boolean isEmpty() {
        return null == first;
    }
    public int size() {
        return N;
    }

    public void enqueue(Item data) {
        Node oldLast = last;
        last = new Node(data);
        last.next = null;
        if (isEmpty()) {
            first  = last;
        }
        else {
            oldLast.next = last;
        }
        N++;
    }
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }


    private class Node {
        Item item;
        Node next;
        Node(Item data) {
            item = data;
        }
    }
    private class QueueIterator implements Iterator<Item> {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item data = current.item;
            current = current.next;
            return data;
        }

        @Override
        public void remove() {

        }
    }

}
