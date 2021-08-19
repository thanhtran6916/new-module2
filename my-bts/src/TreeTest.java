import java.util.TreeSet;

public class TreeTest {
    public static void main(String[] args) {
        BTS myTree = new BTS();
        myTree.insert(30);
        myTree.insert(36);
        myTree.insert(13);
        myTree.insert(54);
        myTree.insert(33);

//        myTree.inorder();
        TreeSet<Integer> a = new TreeSet<>();
        a.add(12);
        a.add(10);
        a.add(39);
        a.add(45);
        System.out.println(a);
    }

}
