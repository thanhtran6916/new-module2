import java.util.PriorityQueue;

public class testQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(3);
        number.add(4);
        number.add(2);
        System.out.println(number.remove());
        System.out.println(number);
    }
}
