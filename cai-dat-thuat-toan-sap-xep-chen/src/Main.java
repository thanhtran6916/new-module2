import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        int[] list = {9,4,3,5,2,1,6,7};
        for (int i = 1; i < list.length; i++) {
            int x = list[i];
            int pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            if (pos != i) {
                list[pos] = x;
            }
        }
        for (int value : list) {
            System.out.println(value);
        }
        
        
    }
    
}
