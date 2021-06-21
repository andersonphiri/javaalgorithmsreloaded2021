package com.anderson.datastructures;

public class GenericSingleLinkedList<Item> {
    private Node first;
    /** Running time O(1) **/
    public  void insertAtBegining(Item data) {
        // step 1 save first into oldFirst
        Node oldFirst = first;
        // next assign first to new node
        first = new Node();
        first.item = data;
        // assign item field to data and its next field to oldfirst
        first.next = oldFirst;
    }
    /** Running time O(1) **/
    public Item removeFromBegining() {
        Item data = first.item;
        // simply assign first to its next
        first = first.next;
        return data;
    }

    public void insertAtEnd(Item data) {
        var lastRef = new Node();
        Node oldLast = lastRef;
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        //for (Node x = first; x != null; x = x.next)

        Node last = new Node();
        last.item = data;
        oldLast.next = last;
    }
    private class Node {
        Item item;
        Node next;

    }
}
