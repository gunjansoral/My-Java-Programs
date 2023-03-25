package DSA.Stack;

import java.util.*;

public class StackArray {
    private int[] arr;
    private int top = -1;

    public StackArray() {

    }

    public StackArray(int capacity) {
        arr = new int[capacity];
        this.top = -1;
    }

    public void push(int data) {
        if (top == arr.length - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (top <= -1) {
            throw new RuntimeException("Stack Underflow");
        }
        int data = arr[top];
        arr[top] = 0;
        top--;
        return data;
    }

    public void print() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(Arrays.toString(this.arr));
        }
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }
}
