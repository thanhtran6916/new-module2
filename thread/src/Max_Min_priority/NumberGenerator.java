package Max_Min_priority;

public class NumberGenerator extends Thread{
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " Number " + i + " " + this.getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
