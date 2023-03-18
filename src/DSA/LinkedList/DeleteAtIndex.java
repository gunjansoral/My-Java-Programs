package DSA.LinkedList;

import java.util.*;

public class DeleteAtIndex {
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
        int index = s.nextInt();
        deleteNodeAtGivenIndex(index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the node at the given index of the LinkedList
    static void deleteNodeAtGivenIndex(int index) {
        Node node = head;
        if (index == 0) {
            head = head.next;
            return;
        }
        int i = 0;
        while (i++ < index - 1) {
            if (node.next == null)
                return;
            node = node.next;
        }
        if (node.next == null) return;
        node.next = node.next.next;
    }
}
