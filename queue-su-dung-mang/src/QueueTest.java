public class QueueTest {
    public static void main(String[] args) {
        MyQueue a = new MyQueue(4);
        a.enqueue(3);
        a.enqueue(4);
        a.enqueue(5);
        a.enqueue(1);

        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println("--------------");
        for (int value : a.getQueueArr()) {
            System.out.println(value);
        }
    }
}
