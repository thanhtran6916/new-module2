
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculator(scanner);
    }

    private static void calculator(Scanner scanner) throws ArithmeticException, InputMismatchException {
        try {
            System.out.println("Nhập số a");
            int x = scanner.nextInt();
            System.out.println("Nhập số b");
            int y = scanner.nextInt();
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println("Không chia được cho số 0");
        } catch (InputMismatchException e) {
            System.err.println("Ký tự nhập vào không phải là số");
        }

    }
}
