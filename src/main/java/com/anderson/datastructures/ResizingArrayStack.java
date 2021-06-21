package com.anderson.datastructures;

import java.util.Iterator;
import java.util.Objects;

public class ResizingArrayStack<Item> implements Iterator<Item> {

    private Item[] a = (Item[]) new Object[4];
    private int N = 0;
    public int size() {
        return N;
    }
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        System.arraycopy(a, 0, temp,0,size());
        a = temp;
    }
    public  Boolean isEmpty() {
        return N == 0;
    }
    public void push(Item item) {
        if(N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }
    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }
    public Item peek() {
        return a[size() - 1];
    }
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    @Override
    public boolean hasNext() {
        return N > 0;
    }

    @Override
    public Item next() {
        return a[--N];
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
