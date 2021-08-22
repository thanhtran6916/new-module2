public class SapXepNoiBot{
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 5, 3, 6, 7, 9};

        boolean check = true;
        for (int i = 1; i < a.length - 1 && check; i++) {
            check = false;
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    check = true;
                }
            }
        }
        for (int value : a) {
            System.out.println(value);
        }
    }
}
