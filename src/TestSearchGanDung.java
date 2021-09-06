import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestSearchGanDung {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        String[] strings = {"Thanh", "Quân", "Trung", "Nam", "Văn"};
        for (String value : strings) {
            list.add(value);
        }
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        for (int i = 0; i < strings.length; i++) {
            if (list.get(i).contentEquals(search)) {
                System.out.println(strings[i]);
            }
        }
    }
}
