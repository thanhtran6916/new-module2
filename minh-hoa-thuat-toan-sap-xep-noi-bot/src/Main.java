import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước");
        int size = scanner.nextInt();
        int[] arrNumber = new int[size];
        for (int i = 0; i < size; i++) {
            arrNumber[i] = scanner.nextInt();
        }
        bubbleSortByStep(arrNumber);
        for (int value : arrNumber) {
            System.out.println(value);
        }
    }

    public static int[] bubbleSortByStep(int[] arrNumber) {
        boolean checkPass = true;
        for (int i = 1; i < arrNumber.length && checkPass; i++) {
            checkPass = false;
            for (int j = 0; j < arrNumber.length - i; j++) {
                if (arrNumber[j] > arrNumber[j + 1]) {
                    int temp = arrNumber[j];
                    arrNumber[j] = arrNumber[j + 1];
                    arrNumber[j + 1] = temp;
                    checkPass = true;
                }
            }
        }
        return arrNumber;
    }

}
