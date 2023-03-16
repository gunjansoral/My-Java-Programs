package DSA.Stack;

import java.util.*;

public class MinimumValueInStack<integer> extends Stack<Integer> {
    private int minWorker(Stack<Integer> stack, int minValue) {
        int top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        }
        if (top < minValue) {
            minValue = top;
        }
        return minWorker(stack, minValue);
    }

    public int min(Stack<Integer> stack) {
        return minWorker(stack, stack.pop());
    }
}
