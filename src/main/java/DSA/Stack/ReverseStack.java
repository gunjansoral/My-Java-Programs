package DSA.Stack;

import java.util.*;

public class ReverseStack {
    public static void insertAtFirst(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int d = stack.pop();
        insertAtFirst(stack, data);
        stack.push(d);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        insertAtFirst(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
