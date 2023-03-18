package DSA.LinkedList;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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

    public Node getHead() {
        return this.head;
    }

    public void printList() {
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class InsertNodeAtPosition {
    public static void insert_element(Node head, int pos, int ele) {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;

        while (temp != null && pos > 2) {
            temp = temp.next;
            pos--;
        }
        if (temp == null) {
            return;
        }

        Node newNode = new Node(ele);
        newNode.next = temp.next;
        temp.next = newNode;
        return;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();

        while (n > 0) {
            list.push(sc.nextInt());
            n--;
        }

        int pos = sc.nextInt();
        int ele = sc.nextInt();
        insert_element(list.getHead(), pos, ele);
        list.printList();
    }
}