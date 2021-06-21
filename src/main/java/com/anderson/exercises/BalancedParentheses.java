package com.anderson.exercises;

import com.anderson.datastructures.StackUsingLinkedList;

public class BalancedParentheses {
    private StackUsingLinkedList<Character> _parentheses;
    public BalancedParentheses() {
        _parentheses = new StackUsingLinkedList<>();
    }
    public boolean CheckIfBalanced(char[] parentheses) {
        if (null == parentheses || parentheses.length %2 > 0) {
            return false;
        }
        char peek = 0;
        for (char source :
                parentheses) {
            if (isLeft(source)) {
                _parentheses.push(source);
                continue;
            }
            else {
                peek = _parentheses.peek();
                if ( isReverseOf(  peek,source)) {
                    _parentheses.pop();
                }

            }

        }
        return _parentheses.isEmpty();
    }
    private static boolean isLeft(char left) {
        switch (left) {
            case '[':
            case '{':
            case '(':
                return true;
            case ']':
            case '}':
            case ')':
                return false;
            default:
                throw new IllegalArgumentException("Illegal brace: "+ left);
        }
    }
    private static boolean isReverseOf(char source, char destination) {
        switch (source) {
            case '[':
                return destination == ']';
            case '{':
                return destination ==  '}';
            case '(':
                return destination == ')';
            default:
                return false;
        }
    }
}
