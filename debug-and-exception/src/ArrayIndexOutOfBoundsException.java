import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Random rd = new Random();
        int[] arrNumber = new int[100];
        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = rd.nextInt(100);
            System.out.print(arrNumber[i] + " ");
        }
        System.out.println();

        System.out.println("Nhập vào chỉ số phần tử 0 < x < 100");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        try {
            System.out.println(arrNumber[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }

    }


}
