import java.util.*;

public class Main {
    public static void main(String[] args) {
        String a = "thoaaanglla;lkht;ljl;ak";
        ArrayList<Character> listAll = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            listAll.add(a.charAt(i));
        }
        LinkedHashSet<Character> listSet = new LinkedHashSet<>(listAll);
        TreeMap<Character, Integer> soLanXuatHien = new TreeMap<>();
        for (Character valueSet : listSet) {
            int count = 0;
            for (Character valueAll : listAll) {
                if (valueSet == valueAll) {
                    count++;
                }
            }
            soLanXuatHien.put(valueSet, count);
        }
        System.out.println(soLanXuatHien.entrySet());
        int max = 0;
        for (Map.Entry<Character, Integer> value : soLanXuatHien.entrySet()) {
            if (max < value.getValue()){
                max = value.getValue();
            }
        }
        for (Map.Entry<Character, Integer> value : soLanXuatHien.entrySet()) {
            if (value.getValue() == max) {
                System.out.println(value);
            }
        }
    }
}
