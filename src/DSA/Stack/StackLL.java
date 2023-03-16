package DSA.Stack;

public class StackLL {
    private ListNode top = null;
    private int count = 0;

    public void push(int data) {
        ListNode node = new ListNode(data);
        node.setNext(top);
        top = node;
        count++;
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack Underflow");
        }
        count--;
        int data = top.getData();
        top = top.getNext();
        return data;
    }

    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack Underflow");
        }
        return top.getData();
    }

    public boolean isEmpty() {
        if (top == null) return true;
        return false;
    }

    public int size() {
        return count;
    }

    public void print() {
        if (this.isEmpty()) System.out.println("Stack is Empty");
        ListNode currentNode = top;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
