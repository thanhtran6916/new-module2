import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String[] paragraph = {"thanh", "thanh", "thanh", "tran", "van", "van", "a"};
        TreeMap<String, Integer> a = new TreeMap<>();
        for (String key : paragraph) {
            if (a.containsKey(key)) {
                a.replace(key, a.get(key) + 1);
            } else {
                a.put(key, 1);
            }
        }
        System.out.println(a);
    }

}
