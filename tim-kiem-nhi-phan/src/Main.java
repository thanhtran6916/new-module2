import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 2, 6, 9, 7, 8};
        Arrays.sort(a);
        System.out.println(search(a, 9));

    }

    public static int search(int[] numbers, int value) {
        int first = 0;
        int last = numbers.length - 1;
        while (first <= last) {
            int half = (first + last) / 2;
            if (value == numbers[half]) {
                return half;
            } else if (value < numbers[half]) {
                last = half - 1;
            } else {
                first = half + 1;
            }
        }
        return -1;
    }
}
