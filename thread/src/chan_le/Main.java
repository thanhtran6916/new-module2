package chan_le;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread("Odd");
        EvenThread evenThread = new EvenThread("Even");
        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();


    }
}
