public class BinarySearchTreeTess {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(3);
        tree.add(4);
        tree.add(2);
        tree.add(1);
        tree.add(0);
        System.out.println(tree.search(-1));


    }
}
