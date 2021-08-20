public class MyLinkedList {
    private Note head;
    private int size;

    public MyLinkedList() {
    }

    class Note {
        private int value;
        private Note next;

        public Note(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void addFirst(int value) {
        if (size == 0) {
            head = new Note(value);
        } else {
            Note temp = head;
            head = new Note(value);
            head.next = temp;
        }
        size++;
    }

    public void add(int value, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("index > size");
        }
        Note temp = head;
        if (index == 0) {
            addFirst(value);
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Note holder = temp.next;
        temp.next = new Note(value);
        temp.next.next = holder;
        size++;
    }

    public int size() {
        return size;
    }

    public void display() {
        Note temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
