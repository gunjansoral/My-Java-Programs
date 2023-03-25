package DSA.LinkedList;

import java.util.*;

public class PrintReverseLinkedList {
    public static void printReverse(Node head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.println(head.data);
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();

        while (n > 0) {
            list.push(sc.nextInt());
            n--;
        }

        printReverse(list.getHead());
    }
}