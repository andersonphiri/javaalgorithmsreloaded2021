package com.anderson.datastructures;

import java.util.Iterator;

public class StackUsingLinkedList<Item> implements Iterable<Item> {
    @Override
    public Iterator<Item> iterator() {
        return new MyStackIterator();
    }

    private class Node {
        Item item;
        Node next;
        Node(Item data) {
            item = data;
        }

    }
    public StackUsingLinkedList() {
        N = 0;
    }

    private Node first;
    private  int N;
    public Boolean isEmpty() {
        return null == first;
    }
    public  int size() {
        return  N;
    }
    public void push(Item data) {
        Node oldFirst = first;
        first = new Node(data);
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item data = first.item;
        first = first.next;
        N--;
        return  data;
    }

    public Item peek() {
        return  first.item;
    }

    private class  MyStackIterator implements Iterator<Item> {
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
    }

}
