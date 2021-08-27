package Racing_Cars;

import java.util.Random;

import static Racing_Cars.Main.DISTANCE;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                for (int i = 0; i < DISTANCE; i++) {
                    if (runDistance > i) {
                        log += "=";
                    } else if (runDistance == i) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println(name + ":" + log + " " + speed);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        long endTime = System.currentTimeMillis();
        long time = (endTime - startTime) / 1000;
        System.out.println("Car's time " + name + " " + time);
    }
}
