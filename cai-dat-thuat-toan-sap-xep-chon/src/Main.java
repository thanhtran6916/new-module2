public class Main {
    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 6, -4};
        for (int i = 0; i < list.length - 1; i++) {
            int max = list[i];
            int indexMax = i;
            for (int j = i + 1; j < list.length; j++) {
                if (max < list[j]) {
                    max = list[j];
                    indexMax = j;
                }
            }
            if (indexMax != i) {
                list[indexMax] = list[i];
                list[i] = max;
            }
        }

        for (int value : list) {
            System.out.println(value);
        }
    }

}
