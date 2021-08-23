import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("không phải là số");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("dừng");
        } finally {
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println("thoát");



    }


}
