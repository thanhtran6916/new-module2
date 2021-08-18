public class MyLinkedListQueue {
    Note head;
    int index = 0;
    MyLinkedListQueue() {
        head = null;
    }

    class Note {
        public int value;
        public Note next;
        Note(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public int enqueue(int value) {
        if (head == null) {
            Note temp = new Note(value);
            head = temp;
        } else {
            Note temp = head;
            head = new Note(value);
            head.next = temp;
        }
        index++;
        return head.value;
    }

    public int dequeue() {
        Note temp = head;
        Note result;
        if (index == 0) {
            throw new ArrayIndexOutOfBoundsException("null");
        } else if (index == 1) {
            result = head;
            head = null;
        } else if (index == 2) {
            result = head.next;
            head.next = null;
        } else {
            for (int i = 0; i < index - 2; i++) {
                temp = temp.next;
            }
            result = temp.next;
            temp.next = null;
        }
        index--;
        return result.value;
    }

    public void display() {
        Note temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
