package count_number;

public class Main {

    public static void main(String args[]) {
        Count count = new Count();
        while (count.getThread().isAlive()) {
            System.out.println(count.getThread().getName() + " isAlive");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
