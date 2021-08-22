public class TimKiemTuyenTinh {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 6, 7, 9, 8};
        System.out.println("tim kiem so 9");
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

}
