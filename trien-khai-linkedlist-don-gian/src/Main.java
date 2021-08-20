public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(6);

        myLinkedList.add(2, 3);

        myLinkedList.display();
    }

}
