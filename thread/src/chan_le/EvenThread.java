package chan_le;

public class EvenThread implements Runnable {
    private String name;

    public EvenThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(name + " number " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
