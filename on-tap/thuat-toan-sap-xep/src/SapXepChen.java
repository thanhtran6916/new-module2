public class SapXepChen {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 3, 4, 6, 7, 8, 5};
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int pos = i;
            while (pos > 0 && x < a[pos - 1]) {
                a[pos] = a[pos - 1];
                pos--;
            }
            a[pos] = x;
        }
        for (int value : a) {
            System.out.println(value);
        }

    }


}
