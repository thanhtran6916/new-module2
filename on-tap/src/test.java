import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("a");
        a.add("v");
        a.add("b");
        for (String value : a) {
            System.out.println(value);
        }

        ComparatorMian c = new ComparatorMian();
        Collections.sort(a, c);
        a.sort(c);

        for (String value : a) {
            System.out.println(value);
        }
    }

}
