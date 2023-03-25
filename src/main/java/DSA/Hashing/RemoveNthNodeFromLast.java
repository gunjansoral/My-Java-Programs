//package DSA.Hashing;
//
//import java.util.List;
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//    Node tail;
//    int size;
//
//    LinkedList() {
//        this.head = null;
//        this.tail = null;
//        size = 0;
//    }
//
//    public void push(int n) {
//        Node newNode = new Node(n);
//        if (this.tail == null) {
//            this.tail = newNode;
//            this.head = newNode;
//            size = 1;
//            return;
//        }
//
//        this.tail.next = newNode;
//        this.tail = newNode;
//        size++;
//    }
//
//    public Node getHead() {
//        return this.head;
//    }
//
//    public void printList() {
//        Node temp = this.head;
//
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//}
//
//// Class name should be "Main",
//// otherwise solution won't be accepted
//public class RemoveNthNodeFromLast {
//    public static Node removeElement(Node head, int n) {
//        //find the index to remove
//        //index = totalIndex - n
////        int index = size
//        Node node = head;
//        while (node != null) {
//            node = node.next;
//        }
//        Node tail = node;
//
//        //remove the node from the given index
//
//        //return the list
//    }
//
//    public static void main(String args[]) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int idxToRemove = sc.nextInt();
//        LinkedList list = new LinkedList();
//
//        while (n > 0) {
//            list.push(sc.nextInt());
//            n--;
//        }
//
//        removeElement(list.getHead(), idxToRemove);
//        list.printList();
//    }
//}
