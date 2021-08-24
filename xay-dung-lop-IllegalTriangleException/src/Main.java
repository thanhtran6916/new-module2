import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try {
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException();
        }
    }
}
