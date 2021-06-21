package com.anderson.datastructures;

import java.util.Iterator;

public class BagUsingLinkedList<Item> implements  Iterable<Item>{

    private int N;
    public Boolean isEmpty() {
        return  null == first;
    }
    public int size() {
        return N;
    }
    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }
    private Node<Item> first;
    public void add(Item item) {
        Node<Item> odlFirst = first;
        first = new Node<Item>(item); // this may be inefficient because of the word new
        N++;
        first.next = odlFirst; // using stack approach
    }

    private class Node<Item> {
        Item item;
        Node<Item> next;
        Node(Item data) {
            item = data;
        }
    }
    public class BagIterator implements Iterator<Item> {
        private Node<Item> current = first;
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
            throw new UnsupportedOperationException();
        }
    }
}
