package DSA.LinkedList;

import java.util.*;

public class DeleteLastNode {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        deleteLastNode();
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static void deleteLastNode() {
        //write your code here
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
    }
}
