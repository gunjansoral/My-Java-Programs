package DSA.Queue;

public class Main {
    public static void test() {
        QueueArray q = new QueueArray(100);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
//        System.out.println(q.size());
        q.print();

    }

    public static void testQueueStack() {
        QueueStack q = new QueueStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();
    }

    public static void main(String[] args) {

        try {
//            test();
            testQueueStack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
