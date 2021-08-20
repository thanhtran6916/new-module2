import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String a = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        char[] b = a.toCharArray();
        Stack<Character> main = new Stack<>();
        for (char value : b) {
            if (value == '(') {
                main.push(value);
            } else if (value == ')') {
                if (main == null) {
                    System.out.println("Sai");
                    break;
                } else {
                    main.pop();
                }
            }
        }
        if (main.size() == 0) {
            System.out.println("đúng");
        } else {
            System.out.println("sai");
        }
        System.out.println(main);
    }
}
