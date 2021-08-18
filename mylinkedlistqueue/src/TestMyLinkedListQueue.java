public class TestMyLinkedListQueue {
    public static void main(String[] args) {
        MyLinkedListQueue a = new MyLinkedListQueue();
        a.enqueue(2);
        a.enqueue(3);
        a.enqueue(4);
        a.enqueue(5);
        a.enqueue(6);
        a.dequeue();
        a.dequeue();
        a.display();

    }
}
