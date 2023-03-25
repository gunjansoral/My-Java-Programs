package DSA.Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesLL {
    Node head;

    //class to create nodes.
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void noRepeat() {
        //Write your code here
        //make a set which contains distinct values of the given array
        HashSet<Integer> set = new HashSet<>();

        //check value of linked list and add it to hashset
        //delete node which contains repeated keys
        Node node = head;
        while (node != null) {
            int key = node.data;
            if (set.contains(key)) {
                delete(key);
            } else {
                set.add(key);
            }
            node = node.next;
        }
    }

    void delete(int key) {
        //null check
        if (head == null) return;
        //if the key is the first node
        if (head.data == key) {
            if (head.next == null) {
                head.next = null;
            } else {
                head = head.next;
            }
            return;
        }
        //search node with given key through traversing
        Node node = head;
        while (node != null && node.next != null && node.next.data != key) {
            node = node.next;
        }
        //node.data = key
        //delete the node with the given key
        if (node.next.next == null) {
            node.next = null;
        } else {
            node.next = node.next.next;
        }
    }

    // Below methods would help you create a singly linked list.
    // inserts a new node at the end of the list.
    public void insert(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    // Method that will print the linked list.
    void print_list() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        RemoveDuplicatesLL obj = new RemoveDuplicatesLL();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.insert(in.nextInt());
        }
        obj.noRepeat();
        obj.print_list();
    }
}
