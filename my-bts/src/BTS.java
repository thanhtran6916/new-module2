public class BTS {

    class TreeNote {
    private int value;
    private TreeNote left;
    private TreeNote right;

    public TreeNote(int value) {
        this.value = value;
    }
}
    private TreeNote root;
    private int size = 0;

    public BTS() {
    }

    public BTS(TreeNote root) {
        this.root = root;
    }

    public void insert(int value) {
        if (size == 0) {
            root = new TreeNote(value);
        } else {
            TreeNote child = root;
            TreeNote parentChild = null;
            while (child != null) {
                if (value > child.value) {
                    parentChild = child;
                    child = child.right;
                } else if (value < child.value) {
                    parentChild = child;
                    child = child.left;
                } else {
                    System.out.println("Giá trị đã tồn tại trong Tree");
                    return;
                }
            }
            if (value > parentChild.value) {
                parentChild.right = new TreeNote(value);
            } else {
                parentChild.left = new TreeNote(value);
            }
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNote root){
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.value + " ");
        inorder(root.right);
    }
}
