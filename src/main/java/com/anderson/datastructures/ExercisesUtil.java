package com.anderson.datastructures;

public class ExercisesUtil<Item> {
    private class Node {
        Item item;
        Node next;

    }
    public Node reverse(Node x) {
        Node first = x;
        Node reverse = null;
        while (first != null) {
            Node second = first.next;
            first.next = reverse;
            reverse = first;

            first = second;
        }
        return  reverse;
    }
    public Node reverseWithRecursion(Node first) {
        if (first == null)
            return null;
        if(first.next == null)
            return first;
        Node second = first.next;
        Node rest = reverseWithRecursion(second);
        second.next = first;
        first.next = null;
        return rest;
    }
}
