import jdk.nashorn.internal.objects.NativeUint8Array;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int x = scanner.nextInt();
        System.out.println("Nhập số b");
        int y = scanner.nextInt();

        calculator(x, y);
    }

    private static void calculator(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } catch (Exception e) {
            System.out.println("loi");
        }
    }


}
