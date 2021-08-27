package loading;


public class Load implements Runnable {
    public int distance = 0;

    @Override
    public void run() {
        while (distance != 100) {
            System.out.print("-");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distance++;
        }
    }
}
