import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    private String word;

    public CheckPalindrome(String word) {
        this.word = word;
    }

    public char[] chuyenChuoiSangChar() {
        char[] newChar = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            newChar[i] = word.charAt(i);
        }
        return newChar;
    }

    public Stack<Character> char1() {
        Stack<Character> charXuoi = new Stack<>();
        for (char value : chuyenChuoiSangChar()) {
            charXuoi.push(value);
        }
        return charXuoi;
    }

    public LinkedList<Character> char2() {
        LinkedList<Character> charNguoc = new LinkedList<>();
        for (char value : chuyenChuoiSangChar()) {
            charNguoc.add(value);
        }
        return charNguoc;
    }

}
