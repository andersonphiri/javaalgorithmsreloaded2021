package com.anderson.algorithms.test;

import com.anderson.algorithms.expressions.DjikstraExpressionEvaluation;
import com.anderson.datastructures.QueueUsingLinkedList;
import com.anderson.exercises.BalancedParentheses;
import com.anderson.exercises.BinaryRepresentation;
import com.anderson.exercises.QueueToStack;

import java.util.Arrays;

public class Application {
    public  static  void main(String... args) {
        try {
          Application app = new Application();
          // app.TestParentheses();
           // app.TestComputeBinary();
            app.testFromQueueToBinaryAndBack();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void TestParentheses() {
        char[] isBalance = new char[] {'[','(',')', ']', '{',
                '}', '{', '[', '(', ')', '(', ')', ']', '(', ')', '}'};
        BalancedParentheses bp = new BalancedParentheses();
        var is = bp.CheckIfBalanced(isBalance);
        System.out.println(Arrays.toString(isBalance) + " : " + is);
        char[] unBalanced = new char[] {'[', '(', ']',')'};
        is = bp.CheckIfBalanced(unBalanced);
        System.out.println(Arrays.toString(unBalanced) + " : " + is);
    }

    void TestComputeBinary() {
        var num = 100L;
        var res = BinaryRepresentation.computeBinaryString(num);
        System.out.println(num + " : " + res);
    }

    void testFromQueueToBinaryAndBack() {
        char[] info = new char[] {'A', 'N', 'D', 'E', 'R','S', 'O', 'N'};
        QueueUsingLinkedList<Character> source = new QueueUsingLinkedList<>();
        for (char c :
                info) {
            source.enqueue(c);
        }
        System.out.print("Before Action: ");
        source.forEach(e -> System.out.print(e));
        System.out.println();
        // do action
        new QueueToStack<Character>().FromQueueToStackAndBack(source);
        System.out.print("After Action: ");
        source.forEach(e -> System.out.print(e));
        System.out.println();
    }
}
