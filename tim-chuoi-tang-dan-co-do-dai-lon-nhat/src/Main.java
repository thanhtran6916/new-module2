import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String string = "Welcome";
        char[] a = string.toCharArray();
        LinkedList<Character> result = new LinkedList<>();
        LinkedList<Character> holse = new LinkedList<>();

        for (int i = 0; i < a.length; i++) {
            holse.add(a[i]);
            char temp = holse.getFirst();
            for (int j = 1; j < a.length; j++) {
                if (temp < a[j]) {
                    holse.add(a[j]);
                    temp = holse.getLast();
                }
            }
            if (holse.size() > result.size()) {
                result = holse;
            }
        }
        System.out.println(result);
    }

}
