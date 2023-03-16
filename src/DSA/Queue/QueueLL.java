package DSA.Queue;

public class QueueLL {
    private ListNode front = null;
    private ListNode rear = null;
    private int count = 0;

    public void enqueue(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        int data = front.getData();
        if (front == rear) {
            front = rear = null;
            count--;
            return data;
        }
        count--;
        front = front.getNext();
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return count;
    }

    public void print() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        ListNode curr = front;
        while (curr != null) {
            System.out.print(curr.getData() + " -> ");
            curr = curr.getNext();
        }
        System.out.println("null");
    }
}
