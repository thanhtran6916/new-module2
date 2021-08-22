public class SapXepChon {
    public static void main(String[] args) {
        int[] a = {3,2,1,4,5,6,8,4};

        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                a[minIndex] = a[i];
                a[i] = min;
            }
        }
        for (int value : a) {
            System.out.println(value);
        }

    }

}
