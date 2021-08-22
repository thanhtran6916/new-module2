import java.util.Arrays;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 6, 7, 9, 8};
        Arrays.sort(a);
        for (int value : a) {
            System.out.println(value);
        }

        System.out.println("tim kiem so 9");
        int index = -1;
        int hear = 0;
        int foot = a.length - 1;
        while (hear <= foot) {
            int haft = (hear + foot) / 2;
            if (a[haft] == 9) {
                index = haft;
                break;
            } else if (9 > a[haft]) {
                hear = haft + 1;
            } else {
                foot = haft - 1;
            }
        }
        System.out.println(index);
    }
}
