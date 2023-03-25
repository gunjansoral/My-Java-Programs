package DSA.Queue;

public class QueueArray {
    int[] arr = null;
    int front = -1, rear = -1;
    int count = 0;

    public QueueArray(int capacity) {
        arr = new int[capacity];
    }

    public void enqueue(int data) {
        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = data;
            count++;
        } else {
            rear++;
            arr[rear] = data;
            count++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        } else {
            int data = arr[0];

            for (int i = front; i <= rear; i++) {
                arr[i] = arr[i + 1];
            }
            if (front == rear) {
                front = rear = -1;
            } else {
                rear--;
            }
            count--;
            return data;
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        return count;
    }

    public void print() {
        if (!isEmpty()) {
            int curr = front;
            while (curr <= rear) {
                System.out.print(arr[curr] + " -> ");
                curr++;
            }
            System.out.println("null");
        }
    }
}
