import java.util.Stack;

public class MainDaoNguocChuoi {
    public static void main(String[] args) {
        String wordString = "Hôm nay là thứ bảy";
        String[] wordArrString = wordString.split(" ");
        Stack<String> newWordArrString = new Stack<>();
        for (String value : wordArrString) {
            newWordArrString.push(value);
        }
        int lengthNewArrString = newWordArrString.size();
        for (int i = 0; i < lengthNewArrString; i++) {
            wordArrString[i] = newWordArrString.pop();
        }
        for (String value : wordArrString) {
            System.out.println(value);
        }


    }
}
