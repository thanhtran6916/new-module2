public class Main {
    public static void main(String[] args) {
//        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        int[] list = {-2, 1, 2, 2, 3, 3, 5, 6, 12, 14};

        boolean checkPass = true;
        for (int i = 1; i < list.length && checkPass; i++) {
            checkPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    checkPass = true;
                }
            }
        }
        for (int value : list) {
            System.out.println(value);
        }
    }
}
