package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(20);
        ll.add(50);
        ll.add(50);
        ll.add(60);
        ll.add(60, 2);
        ll.add(15, 3);
        ll.print();
    }
}
