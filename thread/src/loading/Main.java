package loading;

public class Main {
    public static void main(String[] args) {

        Load load = new Load();
        Thread thread = new Thread(load);

        thread.start();
        System.out.println(Thread.currentThread());;
    }
}
