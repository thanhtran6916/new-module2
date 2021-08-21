import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng");
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        for (int i = 0; i < size; i++) {
            arrNumber[i] = scanner.nextInt();
        }
        sapXepChen(arrNumber);
        for (int value : arrNumber) {
            System.out.println(value);
        }
    }

    public static int[] sapXepChen(int[] arrNumber) {
        for (int i = 0; i < arrNumber.length - 1; i++) {
            int min = arrNumber[i];
            int minIndex = i;
            for (int j = i + 1; j < arrNumber.length; j++) {
                if (min > arrNumber[j]) {
                    min = arrNumber[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arrNumber[minIndex] = arrNumber[i];
                arrNumber[i] = min;
            }
        }
        return arrNumber;
    }

}
