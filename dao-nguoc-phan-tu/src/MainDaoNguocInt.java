import java.util.Stack;

public class MainDaoNguocInt {
    public static void main(String[] args) {
        int[] arrNumber = {2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> newArrNumber = new Stack<>();
        for (int value : arrNumber) {
            newArrNumber.push(value);
        }
        int lengthNewArrNumber = newArrNumber.size();
        for (int i = 0; i < lengthNewArrNumber; i++) {
            arrNumber[i] = newArrNumber.pop();
        }
        for (int value : arrNumber) {
            System.out.println(value);
        }
    }
}
