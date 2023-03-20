package DSA.LinkedList;

class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

class TraverseLL {

    public static void traverse(ListNode head) {
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
        System.out.println();
    }
}

// Class name should be "Main",
// otherwise solution won't be accepted
public class DeleteMiddleNode {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            prev = slow;
            slow = slow.getNext();
        }
        prev.setNext(slow.getNext());
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));

        //TraverseLL.traverse(head);
        ListNode newNode = deleteMiddle(head);
        TraverseLL.traverse(head);
    }
}
