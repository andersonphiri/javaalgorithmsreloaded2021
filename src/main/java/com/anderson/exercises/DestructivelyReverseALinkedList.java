package com.anderson.exercises;

/**
 * reverses and destructs a linked list
 * @param <T>
 */
public class DestructivelyReverseALinkedList<T> {
    public Node<T> reverse(Node<T> firstNode) {
        Node<T> first = firstNode;
        Node<T> reverse = null;
        while (first != null) {
            Node<T> second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }
        return reverse;
    }

    public Node<T> reverseRecursive(Node<T> firstNode) {
        if(firstNode == null) return  null;
        if(firstNode.next == null) return firstNode;
        Node<T> second = firstNode.next;
        Node<T> rest = reverseRecursive(second);
        second.next = firstNode;
        firstNode.next = null;
        return rest;
    }
}
