package DSA.LinkedList;

public class LinkedList {
    public class Node {
        public int value;
        public Node next;

        public boolean hasNext() {
            if (this.next == null) return false;
            return true;
        }
    }

    public Node head = new Node();
    public Node tail = new Node();
    int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void print() {
        Node n = this.head;
        while (n.hasNext()) {
            if (n.next == null) {
                System.out.print(n.value);
            } else {
                System.out.print(n.value + ", ");
            }
            n = n.next;
        }
    }


    public void add(int data) {
        Node newNode = new Node();
        newNode.value = data;
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public void add(int data, int idx) {
        Node newNode = new Node();
        newNode.value = data;
        if (this.head == null || this.length < idx) {
            return;
        }
        Node n = this.head;
        for (int i = 0; i < idx - 1; i++) {
            n = n.next;
        }
        newNode.next = n.next;
        n.next = newNode;
        this.length++;
    }

    public int remove(int key) {
        if (head == null) {
            throw new RuntimeException("List is Empty");
        }
        Node n = head;
        while (n.hasNext() || n.value != key) {
            n = n.next;
        }
        this.length--;
        return key;
    }
}
