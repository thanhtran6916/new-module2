import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển sang hệ nhị phân");
        int number = scanner.nextInt();
        Stack<Integer> binary = arrBinary(number);
        int[] result = new int[binary.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = binary.pop();
        }
        for (int value : result) {
            System.out.print(value);
        }
    }

    private static Stack<Integer> arrBinary(int number) {
        Stack<Integer> binary = new Stack<>();
        if (number == 0) {
            binary.add(number);
        } else {
            while (number != 0) { //number chia 2 cho đến khi bằng 0 thì dừng lại
                int temp;
                temp = number % 2;
                number = number / 2;
                binary.add(temp);
            }
        }
        return binary;
    }

}
