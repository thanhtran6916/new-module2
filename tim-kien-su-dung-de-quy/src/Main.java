public class Main {
    public static void main(String[] args) {
        int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left = 0;
        int right = arrNumber.length;
        System.out.println(BinarySearch(arrNumber, 8, left, right));
    }

    public static int BinarySearch(int[] arrNumber, int value, int left, int right) {
        int middle = (left + right) / 2;
        if (arrNumber[middle] == value) {
            return middle;
        }
        if (value < arrNumber[middle]) {
            right = middle - 1;
        }
        if (value > arrNumber[middle]) {
            left = middle + 1;
        }
        return BinarySearch(arrNumber, value, left, right);
    }


}
