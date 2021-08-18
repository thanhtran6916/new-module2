import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập Palindrome");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase(Locale.ROOT);
        CheckPalindrome test = new CheckPalindrome(word);
        System.out.println(test.char1());
        System.out.println("--------------");
        System.out.println(test.char2());

        Stack<Character> char1 = test.char1();
        LinkedList<Character> char2 = test.char2();
        int length = char1.size();
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            char a = char1.pop();
            char b = char2.removeFirst();
            if (a == b) {
                flag = true;
            } else {
                flag = false;
                System.out.println(a + " khác " + b);
                break;
            }
        }
        System.out.println(flag);
    }
}
