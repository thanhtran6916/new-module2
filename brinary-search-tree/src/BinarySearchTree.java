public class BinarySearchTree {
    private Note hear;
    private int size;

    public BinarySearchTree() {
        this.hear = null;
        size = 0;
    }

    class Note {
        private int value;
        private Note right;
        private Note left;

        public Note(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }

    public boolean add(int value) {
        if (size == 0) {
            hear = new Note(value);
        } else {
            Note child = hear;
            Note parent = null;
            while (child != null) {
                parent = child;
                if (value > child.value) {
                    child = child.right;
                } else if (value < child.value) {
                    child = child.left;
                } else {
                    System.out.println("giá trị đã tồn tại");
                    return false;
                }
            }
            if (value > parent.value) {
                parent.right = new Note(value);
            } else {
                parent.left = new Note(value);
            }
        }
        size++;
        return true;
    }

    public boolean search(int value) {
        Note temp = hear;
        while (temp != null) {
            if (value > temp.value) {
                temp = temp.right;
            } else if (value < temp.value) {
                temp = temp.left;
            } else {
                return true;
            }
        }
        return false;
    }
}
