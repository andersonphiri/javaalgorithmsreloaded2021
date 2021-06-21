package com.anderson.exercises;

import com.anderson.datastructures.QueueUsingLinkedList;
import com.anderson.datastructures.StackUsingLinkedList;
/**
 * Useful for reversing elements
 * */
public class QueueToStack<ItemModel> {

    public  void FromQueueToStackAndBack( QueueUsingLinkedList<ItemModel> source){
        StackUsingLinkedList<ItemModel> stack = new StackUsingLinkedList<>();
        while (!source.isEmpty()) {
            stack.push(source.dequeue());
        }
        while (!stack.isEmpty()) {
            source.enqueue(stack.pop());
        }
    }

}
