package DSA.LinkedList;

public class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void push(int n) {
        Node newNode = new Node(n);
        if (this.tail == null) {
            this.tail = newNode;
            this.head = newNode;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;
    }

    public void printList() {
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node getHead() {
        return this.head;
    }
}
