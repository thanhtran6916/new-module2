import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static final String NAM = "nam";
    public static final String NU = "nữ";

    public static void main(String[] args) {
        final int size = 5;
        Staff[] staffArr = new Staff[size];
        staffArr[0] = new Staff("Thành", 25, NAM);
        staffArr[1] = new Staff("Linh", 22, NU);
        staffArr[2] = new Staff("Văn", 26, NAM);
        staffArr[3] = new Staff("Hương", 18, NU);
        staffArr[4] = new Staff("Trần", 25, NAM);
        Arrays.sort(staffArr);

        PriorityQueue<Staff> nu = new PriorityQueue<>();
        PriorityQueue<Staff> nam = new PriorityQueue<>();

        for (Staff staff : staffArr) {
            if (staff.getGender().equals(NU)) {
                nu.add(staff);
            } else {
                nam.add(staff);
            }
        }

        Staff[] outPut = new Staff[size];
        for (int i = 0; i < outPut.length; i++) {
            if (nu.size() != 0 ) {
                outPut[i] = nu.remove();
            } else {
                outPut[i] = nam.remove();
            }
        }

        for (Staff staff : outPut) {
            System.out.println(staff);
        }
    }

}
