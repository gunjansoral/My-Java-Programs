package DSA.Queue;

import java.util.*;

public class QueueStack {
    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    public void enqueue(int data) {
        stk1.push(data);
    }

    public int dequeue() {
        if (stk1.isEmpty()) {
            throw new RuntimeException("Queue is underflow");
        } else {
            //pop all the values of stk1
            while (!stk1.isEmpty()) {
                int temp = stk1.pop();
                stk2.push(temp);
            }
            int data = stk2.pop();
            while (!stk2.isEmpty()) {
                int temp = stk2.pop();
                stk1.push(temp);
            }
            return data;
        }
    }

    public void print() {
        if (stk1.isEmpty()) {
            throw new RuntimeException("Queue is underflow");
        } else {
            //pop all the values of stk1
            while (!stk1.isEmpty()) {
                int temp = stk1.pop();
                stk2.push(temp);
            }
            while (!stk2.isEmpty()) {
                int temp = stk2.pop();
                System.out.print(temp + " -> ");
                stk1.push(temp);
            }
            System.out.println("null");
        }
    }
}
