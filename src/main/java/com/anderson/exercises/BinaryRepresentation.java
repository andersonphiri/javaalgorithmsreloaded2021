package com.anderson.exercises;

import com.anderson.datastructures.StackUsingLinkedList;

public class BinaryRepresentation {
    private static StackUsingLinkedList<Long> _binary;
    static {
        _binary = new StackUsingLinkedList<>();
    }
    public static String computeBinaryString(Long n) {
        StringBuilder sb = new StringBuilder();
        long temp;
        while (n > 0) {
            temp = n % 2;
            _binary.push(temp);
            sb.append(temp);
            n = n / 2;
        }
        System.out.print("Binary representation: ");
        _binary.forEach(e -> System.out.print(e));
        System.out.println();

        return sb.reverse().toString();

    }
}
